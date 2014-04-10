
import java.io.Serializable;

/**
 *
 * @author SpeeDy1216
 */
public class Entreprise implements Serializable{
    private String nom;
    private String mail;
    private String adresseVilleEntreprise;
    private String adresseCodePostalEntreprise;
    private String adresseRueEntreprise;
    private String telEntreprise;
    private String secteurActivite;

    /**
     * Constructeur
     * @param nom
     * @param adresseVilleEntreprise
     * @param adresseCodePostalEntreprise
     * @param adresseRueEntreprise
     * @param telEntreprise
     * @param mail
     * @param secteurActivite 
     */
    public Entreprise(String nom, String adresseVilleEntreprise, String adresseCodePostalEntreprise, String adresseRueEntreprise, String telEntreprise,String mail, String secteurActivite) {
        this.nom = nom;
        this.adresseVilleEntreprise = adresseVilleEntreprise;
        this.adresseCodePostalEntreprise = adresseCodePostalEntreprise;
        this.adresseRueEntreprise = adresseRueEntreprise;
        this.telEntreprise = telEntreprise;
        this.mail = mail;
        this.secteurActivite = secteurActivite;
    }

    public String getMail() {
        return mail;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresseVilleEntreprise() {
        return adresseVilleEntreprise;
    }

    public String getAdresseCodePostalEntreprise() {
        return adresseCodePostalEntreprise;
    }

    public String getAdresseRueEntreprise() {
        return adresseRueEntreprise;
    }

    public String getTelEntreprise() {
        return telEntreprise;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }
    
    
}
