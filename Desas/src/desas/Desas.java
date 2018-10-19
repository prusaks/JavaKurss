
package desas;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Desas {
    
    public static void main(String[] args) {
        
        Laukums laukums = new Laukums();//izveido speles laukumu
        laukums.printLaukums();//izvada sakuma laukumu
        int x = 0, y = 0;//koordinatu mainigie
        boolean uzvara = false;
        
        boolean speletajs = true; //true - 1.speletaja gajiens, false - 2.speletaja gajiens
        //turpinas tik ir, kamer tiek aizpildits laukums
        while(!laukums.vaiIrPilns()){        
            do {
                //nosaka, kura speletaja gajiens
                if(speletajs){
                    System.out.println("1. speletaja gajiens");
                } else {
                    System.out.println("2. speletaja gajiens");
                }
                //Ievada tik ilgi, kamer ir korektas x koordinatas
                do{
                    System.out.println("Ievadi x koordinatas:");
                    x = koordinatesIevade();
                } while(x < 1 || x > 3);
                //Ievada tik ilgi, kamer ir korektas y koordinatas
                do{
                    System.out.println("Ievadi y koordinatas:");
                    y = koordinatesIevade();
                } while(y < 1 || y > 3);                
            } while(!laukums.vaiIrPieejams(x, y));
            
            laukums.mainaLaukumu(x, y, speletajs);//izmainaa laukumu pec speletaja noraditajam koordinatem
            if(laukums.vaiIrUzvara(speletajs)){ //ja ir uzvara, tad seko izeja no cikla
                laukums.printLaukums();
                uzvara = true;
                break;
            }
            laukums.printLaukums();//izvada situaciju uz laukuma
            speletajs = !speletajs;//speletaju maina
        }
        if(!uzvara){
            System.out.println("Neizskirts!");
        }
        System.out.println("Speles beigas!");
    }
    
    //Ievada koordinates punktu un parbauda vai ievade ir korekta
    public static int koordinatesIevade(){
        Scanner scanner = new Scanner(System.in);//skaitlu ievadei
        int punkts = 0;
        try{
            punkts = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nekorekta ievade!");
            punkts = 4;
            scanner.next();
        }  
        
        return punkts;
    }
    
}
