package com.groupeisi.minievaluation.dto;

public class CoursDto {
    private long id;

    private String matiere;

    private String professeur;

    private String classe;

    public CoursDto() {

    }

    public CoursDto(String matiere, String professeur, String classe) {
        this.matiere = matiere;
        this.professeur = professeur;
        this.classe = classe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getProfesseur() {
        return professeur;
    }

    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
