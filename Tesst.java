/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesst;
class Siswa{
    int nrp;
    public void setNrp(int i) {
        nrp=i;
        
   
    }    
}
/**
 *
 * @author User
 */
public class Tesst {

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Siswa anak=new Siswa() ;
     anak.setNrp(5);
     System.out.println(anak.nrp);
     
        // TODO code application logic here
    }
    
}
