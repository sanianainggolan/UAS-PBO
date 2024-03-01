/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorpismebuku;

/**
 *
 * @author HP
 */
public class BukuFiksi extends Buku {
    private String genre;
    
    BukuFiksi(String judul, String penulis, String genre){
        super(judul,penulis);
        this.genre = genre;
    }
  
    void tampilanInfo(){
        super.tampilkanInfo();
        System.out.println("Genre: " + genre);
    

}  
}
