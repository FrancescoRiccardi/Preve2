/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preve2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco
 */
public class ThDon extends Thread{
    DatiCondivisi Dat =new DatiCondivisi();

    public ThDon(DatiCondivisi CDat) {
        Dat = CDat;
    }
    
    public void run(){
        System.out.println("Don");
        
        Dat.waitDon();
        Dat.signalDin();
    }
}
