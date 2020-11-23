/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author Kirana
 */
public class UTSpbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metod k = new metod();
        k.tampilan();
        do{
           k.Menu();
           k.level1();
        }while(k.pilih!=3);

         
    }
    
}
