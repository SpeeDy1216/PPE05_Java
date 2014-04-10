import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SpeeDy1216
 */
public class MainProjet {
    public static ArrayList<OffreStage> lesOffres = new ArrayList<OffreStage>();
    public static ArrayList<Entreprise> lesEntreprises = new ArrayList<Entreprise>();
   
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            FileInputStream f = new FileInputStream("saveOffre.txt");
            ObjectInputStream s = new ObjectInputStream(f);
            lesOffres = (ArrayList<OffreStage>) s.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Jframe.class.getName()).log(Level.SEVERE, null, ex);
        }
       Jframe j = new Jframe();
       j.setVisible(true);
    }
}
