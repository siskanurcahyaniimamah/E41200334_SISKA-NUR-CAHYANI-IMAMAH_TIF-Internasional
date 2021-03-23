/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalno3array;

/**
 *
 * @author Dian
 */
public class soalno3array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] [] angka = {{5,6,1,7,},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
        for (int baris = 0; baris < 4; baris++){
            for (int kolom = 0; kolom < 4; kolom++){
                System.out.print(angka[baris][kolom]+" ");
            }
            System.out.println(" ");
        }
    }
}

    


    
    

