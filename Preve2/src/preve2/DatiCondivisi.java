
package preve2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco
 */
public class DatiCondivisi {
    private Semaphore syncDon;
    private Semaphore syncDin;

    public DatiCondivisi() {
        this.syncDon = new Semaphore(1);
        this.syncDin = new Semaphore(0);
    }
    
    public synchronized void waitDon(){
        try {
            this.syncDon.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public synchronized void waitDin() {
        try {
            this.syncDin.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public synchronized void signalDon(){
        this.syncDon.release() ;
    }
    
    public synchronized void signalDin(){
        this.syncDin.release();
    }
    
    
    
}
