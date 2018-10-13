
package day1;

import java.util.Scanner;


public class Day1 {

    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int skaitlis = 5; //Mainiga deklaracija un mainiga definesana
        System.out.println(skaitlis);
        skaitlis = 8 + 4; //Mainiga definesana
        System.out.println(skaitlis);
        
        float arKomatu = 5.3f;
        double otrsArKomatu = 4.5;//labak izmantot double neka float
        
        char simbols = '?';
        char simbolsArSkaitli = '5';
        
        String simboluVirkne = "Si ir virkne";
        simboluVirkne = "Hello world!";
        System.out.println(simboluVirkne + " cits " + " kaut kas " + skaitlis);
        
        boolean jaVaiNe = true;
        jaVaiNe = false;
        
//        Scanner sc = new Scanner(System.in);
//        simboluVirkne = sc.nextLine();
//        System.out.println(simboluVirkne);
        
        System.out.println("Sveiki, ka Jus sauc?");
        
        Scanner scanner = new Scanner(System.in);
        String vards = scanner.nextLine();
        System.out.println("Sveiki, "  + vards + "!");
    }

}
