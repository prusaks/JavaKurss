/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author ja_tu
 */
public class Day5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Uzdevumi uzdevumi = new Uzdevumi();
//        System.out.println(uzdevumi.izvade());
//        String str = uzdevumi.ievade();
//        System.out.println(uzdevumi.ievadesRezultats(str));
        int sk = uzdevumi.skaitlaIevade();
        System.out.println("Izvades rezultats " + uzdevumi.isPositive(sk));
        
    }
    
}
