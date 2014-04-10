
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SpeeDy1216
 */
public class OffreStage implements Serializable{
    private Entreprise entreprise;
    private String libelleOffre; 
    private String descriptifOffre;
    private String domaineOffre;
    private String dateDebutOffre;
    private String dureeOffre;
    private String cheminOffre;
    private boolean valide;

    /**
     * Constructeur
     * @param libelleOffre
     * @param descriptifOffre
     * @param domaineOffre
     * @param dateDebutOffre
     * @param dureeOffre
     * @param cheminOffre
     * @param valide
     * @param entreprise 
     */
    public OffreStage(String libelleOffre, String descriptifOffre, String domaineOffre, String dateDebutOffre, String dureeOffre, String cheminOffre, boolean valide,Entreprise entreprise) {
        this.libelleOffre = libelleOffre;
        this.descriptifOffre = descriptifOffre;
        this.domaineOffre = domaineOffre;
        this.dateDebutOffre = dateDebutOffre;
        this.dureeOffre = dureeOffre;
        this.cheminOffre = cheminOffre;
        this.valide = valide;
        this.entreprise = entreprise;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }
    
    public String getLibelleOffre() {
        return libelleOffre;
    }

    public String getDescriptifOffre() {
        return descriptifOffre;
    }

    public String getDomaineOffre() {
        return domaineOffre;
    }

    public String getDateDebutOffre() {
        return dateDebutOffre;
    }

    public String getDureeOffre() {
        return dureeOffre;
    }

    public String getCheminOffre() {
        return cheminOffre;
    }

    public boolean isValide() {
        return valide;
    }
    
    
}
