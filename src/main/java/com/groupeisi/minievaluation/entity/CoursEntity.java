package com.groupeisi.minievaluation.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cours")
public class CoursEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "matiere", nullable = false)
    private String matiere;

    @Column(name = "professeur", nullable = false)
    private String professeur;

    @Column(name = "classe")
    private String classe;

    public CoursEntity() {
    }

    public CoursEntity(String matiere, String professeur, String classe) {
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
