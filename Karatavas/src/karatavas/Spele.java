package karatavas;

import java.util.Scanner;

public class Spele {
    public static final int DZIVIBAS = 5; //Dzivibu skaits spele
    public static final char SIMBOLS = '*'; //Apzime aizklatos burtus
    private String uzminetais = "";//Glaba atminetos burtus un neatminetos burtus viena simbola veida
    
    public Spele(){
        System.out.println("Jauna spele!");
    }
    
    //aizklaj vardu ar konstantes simbolu
    public String vardaSlepsana(String vards){
        for(int i = 0; i < vards.length(); i++){
            uzminetais +=SIMBOLS;
        }
        return uzminetais;
    }
    
    //atgriez vardu ar jau uzminetajiem un neuzminetajiem burtiem
    public String uzminetieBurti(String vards){
        return uzminetais;
    }
    
    //dazada veida ievades
    public String ievadaDatus(int i){
        Scanner sc = new Scanner(System.in);
        switch(i){
            case 1:
                System.out.println("Ievadi vardu");
                return sc.nextLine().toUpperCase();
            case 2:
                System.out.println("Ievadi simbolu");
                return sc.nextLine().toUpperCase();
            case 3:
                System.out.println("Ievadi vai velies beigt Y");
                return sc.nextLine().toUpperCase();
            default:
                return "cita vertiba";
        }          
    } 
    
    //vai ievaditais simbols sakrit ar kadu no varda burtiem un veic vajadzigas
    //izmainas atmineto burtu simbolu virkne
    public boolean vaiSakrit(String vards, String simbols){
        int sakrit = 0;
        char[] uVards = new char[vards.length()];
        uVards = uzminetais.toCharArray();
        
        for(int i = 0; i < vards.length(); i++){
            if(vards.charAt(i) == simbols.charAt(0)){
                uVards[i] = simbols.charAt(0);
                sakrit++;
            } 
        }
        
        uzminetais = "";
        for(int i = 0; i < uVards.length; i++){
            uzminetais +=uVards[i];
        }
        
        if(sakrit > 0){
            return true;
        } else {
            return false;
        }
    }
    
    //parbauda, vai vards ir uzminets
    public boolean vaiIrUzminets(String vards){
        return uzminetais.equals(vards);
    }
    
    //parbauda, vai vienigais ievaditais simbols ir skaitlis
    public boolean vaiIrSkaitlis(String burts){
        String skaitluMasivs = "0123456789";
        for(int i = 0; i < skaitluMasivs.length(); i++){
            if(skaitluMasivs.charAt(i)==burts.charAt(0)){
                return true;
            }
        }
        return false;
    }
    
    public boolean vaiAtkartojas(String burts){
        for(int i = 0; i < uzminetais.length(); i++){
            if(uzminetais.charAt(i) == burts.charAt(0)){
                return true;
            }
        }
        return false;
    }

}
