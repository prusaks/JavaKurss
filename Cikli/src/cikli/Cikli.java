/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cikli;

/**
 *
 * @author ja_tu
 */
public class Cikli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Piemeri piem = new Piemeri();
//        piem.meginajums();
        Uzdevumi uzd = new Uzdevumi();
//        uzd.masivaIzvade();
        uzd.zvaigznisuIzvade();
        System.out.println(uzd.kapinasana(-2, 3));
        uzd.skaitlaIevade();
        piem.citiCikli();
    }
    
}
