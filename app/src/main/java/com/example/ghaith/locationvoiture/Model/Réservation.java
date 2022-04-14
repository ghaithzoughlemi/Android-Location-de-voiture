package com.example.ghaith.locationvoiture.Model;

/**
 * Created by ghaith on 09/04/2018.
 */

public class Réservation {


    private int id;
    private String ville;
    private String agence;
    private String numserie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDatdeb() {
        return datdeb;
    }

    public void setDatdeb(String datdeb) {
        this.datdeb = datdeb;
    }

    public String getDatfin() {
        return datfin;
    }

    public void setDatfin(String datfin) {
        this.datfin = datfin;
    }

    private String marque;
    private String datdeb;
    private String datfin;

    }
