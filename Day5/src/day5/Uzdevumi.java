package day5;

import java.util.Scanner;


public class Uzdevumi {
    private Scanner scanner = new Scanner(System.in);
                    
    public String izvade(){
        return izvade1() + " " + izvade2();
    }
    
    private String izvade1(){
         return "Man patik";
    }
    
    private String izvade2(){
        return "programmet";
    }
    
    public String ievade(){        
        System.out.println("Ievadiet simbolu virkni!");
        return scanner.nextLine();
    }
    
    public String ievadesRezultats(String str){
        if(str.length() >= 1 && str.length() < 7){
            return "Veiksmigi";
        } else {
            return "Neveiksmigi";
        }
    }
    
    public int skaitlaIevade(){
        System.out.println("Ievadiet skaitli: ");
        return scanner.nextInt();
    }
    
    public boolean isPositive(int sk){
        if (sk >= 0){
            return true;
        } else {
            return false;
        }
    }

}
