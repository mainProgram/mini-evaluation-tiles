package com.groupeisi.minievaluation.controller;

import com.groupeisi.minievaluation.dto.CoursDto;
import com.groupeisi.minievaluation.service.CoursService;
import com.groupeisi.minievaluation.service.ICoursService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CoursController {
    private static final Logger logger = LoggerFactory.getLogger(CoursController.class);

    private ICoursService coursService;

    public CoursController(){
        this.coursService = new CoursService();
    }

    @GetMapping("/")
    public String showCours(Model model) {
        logger.info("CoursController - Méthode GET appelée pour afficher les cours");

        try {
            Optional<List<CoursDto>> cours = coursService.findAll();
            if (cours.isPresent()) {
                logger.info("CoursController - Liste des cours récupérée avec succès");
                model.addAttribute("coursList", cours.get());
            } else {
                logger.info("CoursController - Aucun cours trouvé");
                model.addAttribute("coursList", new ArrayList<CoursDto>());
            }
        } catch (Exception e) {
            logger.error("CoursController - Erreur lors de la récupération des cours", e);
        }

        return "cours";
    }

    @PostMapping("/cours")
    public String saveCours(
            @RequestParam("matiere") String matiere,
            @RequestParam("professeur") String professeur,
            @RequestParam("classe") String classe) {

        logger.info("CoursController - Méthode POST appelée pour enregistrer un cours");
        logger.debug("CoursController - Paramètres reçus : matiere={}, professeur={}, classe={}", matiere, professeur, classe);

        CoursDto courDto = new CoursDto();
        courDto.setMatiere(matiere);
        courDto.setProfesseur(professeur);
        courDto.setClasse(classe);

        try {
            boolean courSaved = coursService.save(courDto);

            if (courSaved) {
                logger.info("CoursController - Cours enregistré avec succès");
            } else {
                logger.warn("CoursController - Échec de l'enregistrement du cours");
            }
        } catch (Exception e) {
            logger.error("CoursController - Erreur lors de l'enregistrement du cours", e);
        }

        return "redirect:/";
    }

}
