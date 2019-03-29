package preve2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco
 */
public class Preve2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DatiCondivisi Dat = new DatiCondivisi();
            ThDon o = new ThDon(Dat);
            ThDin i = new ThDin(Dat);
            
            o.start();
            
            o.join();
            
            
            i.start();
            
            
            i.join();
            System.out.println("fine");
        } catch (InterruptedException ex) {
            Logger.getLogger(Preve2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
