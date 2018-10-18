package cikli;

import java.util.Scanner;


public class Piemeri {
    
    public void meginajums(){
        for(int i = 0; i < 5; i++){
            int b = 9 + i;
            System.out.println(b);
        }
        
        for(int i = 5; i > -1; i--){
            System.out.println(i);
        }
    }
    
    public void citiCikli(){
        String ievade = "iziet";
        Scanner scanner = new Scanner(System.in);
        
        while(!ievade.equals("iziet")){
            System.out.println("Hello world");
            ievade = scanner.nextLine();
        }
        
        do{
            System.out.println("Hello world");
            ievade = scanner.nextLine();
        }while(!ievade.equals("iziet"));
    }

}
