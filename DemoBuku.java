/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobuku;
class Buku{
        String pengarang;
        String judul;
        public void setPengarang(String i){
            pengarang=i;
        } 
        public void setJudul(String i) {
            judul=i;       }         
}        

/**
 *
 * @author User
 */
public class DemoBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Buku a,b;
         a=new Buku();
         b=new Buku();
         
        a.pengarang="Felix Siauw";
        b.judul="Beyond The Inspiration";
        b.pengarang="Budi Raharjo";
        b.judul="Mudah Belajar Java";
     System.out.println("Judul:"+a.judul+" pengarang:" + a.pengarang);
     System.out.println("Judul:"+b.judul+" pengarang:"+ b.pengarang);
    }
    
}
