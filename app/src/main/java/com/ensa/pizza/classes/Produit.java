package com.ensa.pizza.classes;

public class Produit {
    private int id;
    private String nom;
    private int nbringredients;



    private int photo;
    private  float duree;
    private String detaisIngred;

    private String description;
    private String preparation;

    private static int comp;

    public Produit() {

    }

    public Produit(String nom, int nbringredients, int photo, float duree,String detaisIngred,String description,String preparation) {
        this.id=++comp;
        this.nom = nom;
        this.nbringredients = nbringredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisIngred=detaisIngred;
        this.description=description;
        this.preparation=preparation;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbringredients(int nbringredients) {
        this.nbringredients = nbringredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getNom() {
        return nom;
    }

    public int getNbringredients() {
        return nbringredients;
    }

    public int getPhoto() {
        return photo;
    }

    public float getDuree() {
        return duree;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nom='" + nom + '\'' +
                ", nbringredients=" + nbringredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detaisIngred='" + detaisIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
