/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponerfaltas;

/**
 *
 * @author sergio
 */
public class Persona {
    private String nom;
    private String cognom;
    private int faltes;
    private String foto;

    public Persona(){}
    public Persona(String str){
        String[] camps;
        camps=str.split(";");
        this.setNom(camps[0]);
        this.setCognom(camps[1]);
        this.setFaltes(Integer.parseInt(camps[2]));
    }
    public Persona(String nom, String cognom, int faltes, String foto) {
        this.nom = nom;
        this.cognom = cognom;
        this.faltes = faltes;
        this.foto = foto;
    }
    public Persona(String nom, String cognom, int faltes) {
        this.nom = nom;
        this.cognom = cognom;
        this.faltes = faltes;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getFaltes() {
        return faltes;
    }

    public void setFaltes(int faltes) {
        this.faltes = faltes;
    }
    
    
}
