/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorpismekue;

/**
 *
 * @author HP
 */
public class Polymorpismekue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kue kue1 = new Kue("Brownies", 500);
        KueKering kue2 = new KueKering("Kue Kacang", 300, 2);
        
        kue1.infoKue();
        System.out.println("-------------");
        kue2.infoKueKering();
    }
    
}
