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
public class Kue {
    String jenis;
    int beratGram;
    
    Kue(String jenis, int bratGram){
        this.jenis = jenis;
        this.beratGram = beratGram;
    }
    
    void infoKue(){
        System.out.println("Jenis Kue: " + jenis);
        System.out.println("Berat: " + beratGram + "gram");
    }
    
}
