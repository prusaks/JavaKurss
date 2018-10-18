package cikli;

import java.util.Scanner;


public class Uzdevumi {
    
    public void masivaIzvade(){
        System.out.println("Masiva izvade:");
        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }
    
    public void zvaigznisuIzvade(){
        
        String zvaigznes = "";
        for(int i = 0; i < 4; i++){
            zvaigznes = zvaigznes + "*";
            System.out.println(zvaigznes);                               
        }
    }
    
    public int kapinasana(int baze, int pakape){
        int rez = baze;
        
        if (pakape != 0){
            for(int i = 1; i < pakape; i++){                
                rez = rez * baze;                
            }
        } else {
            return 1;
        }
                       
        return rez;
    }
    
    public void skaitlaIevade(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet minimalo skaitli!");
        int min = scanner.nextInt();
        
        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet skaitli");
            int sk = scanner.nextInt();
            
            if(sk == min){
                System.out.println("Uzminejat");
                break;
            } else {
                if(i == 4){
                    System.out.println("Spele beigusies");
                } else {
                    System.out.println("Meginiet vel");
                }
            }
        }
    }
    
    

}
