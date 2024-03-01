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
public class KueKering extends Kue{
    int jumlahKemasan;
    
    KueKering(String jenis, int beratGram, int JumlahKemasan){
        super(jenis, beratGram);
        this.jumlahKemasan = jumlahKemasan;
    }
    void infoKueKering(){
        super.infoKue();
        System.out.println("Jumlah Kemasan: + jumlahKemasan");
        
        
    }
    
}
