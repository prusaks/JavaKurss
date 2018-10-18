
package day6;

import java.util.Scanner;


public class Day6 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String izvele = "";
        Aprekini apr = new Aprekini();
        double res, skaitlis1, skaitlis2;
        
        while(!izvele.equals("iziet")){    
            System.out.println("Ievadiet operaciju:");        
            boolean vaiSekmigs = false;
            do{ 
                String darbiba = scanner.nextLine();
                switch(darbiba){
                    case "+":
                        skaitlis1 = skaitluIevade(1);
                        skaitlis2 = skaitluIevade(2);
                        res = apr.saskaitit(skaitlis1, skaitlis2);
                        System.out.println(skaitlis1 +" + "+ skaitlis2 + " = " + res); 
                        vaiSekmigs = true;
                        break;
                    case "-":
                        skaitlis1 = skaitluIevade(1);
                        skaitlis2 = skaitluIevade(2);
                        res = apr.atnemt(skaitlis1, skaitlis2);
                        System.out.println(skaitlis1 +" - "+ skaitlis2 + " = " + res);
                        vaiSekmigs = true;
                        break;
                    case "kapinasana":
                        skaitlis1 = skaitluIevade(1);
                        int pakape = pakapesIevade();
                        res = apr.kapinasana(skaitlis1, pakape);                      
                        System.out.println(skaitlis1 + " " + pakape + ". pakape ir " + res);
                        vaiSekmigs = true;
                        break;
                    case "faktorials":
                        int faktorials = pakapesIevade();
                        res = apr.faktorializacija(faktorials);
                        System.out.println(faktorials + " faktorials  ir " + res);
                        vaiSekmigs = true;
                        break;
                    default:
                        System.out.println("Nepareiza ievade!");
                        System.out.println("Meginiet vel!");
                        break;
                    }            
                } while(!vaiSekmigs);
            
            System.out.println("Vai beigt? Ievadi iziet");
            izvele = scanner.nextLine();
        }
                      
    }
    
    public static double skaitluIevade(int i){
        Scanner scanner = new Scanner(System.in);
        double skaitlis;
        do{
            System.out.println("Ievadiet " + i + "." + " skaitli!");         
            try{
                skaitlis = scanner.nextDouble();
                return skaitlis;
            } catch (Exception e){
                System.out.println("Kludaina ievade! Meginiet vel!");
            } 
        } while(true);
                   
    }
    
    public static int pakapesIevade(){
        int pakape;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Ievadiet skatili!");
            try{               
                pakape = scanner.nextInt();
                return pakape;
            } catch (Exception e){
                System.out.println("Nepareizi ievadita pakape! Meginiet vel!");
            } 
        } while(true);
        
    }
    
}
