
package karatavas;

public class Karatavas {
    
    public static void main(String[] args) {
        Spele spele = new Spele();//sakam speli
        
        String vards = spele.ievadaDatus(1);//ievada minamo vardu
        
        int atlikushasDzivibas = spele.DZIVIBAS;//pieskir dzivibu skaitu
        
        //definejam dazadus mainigos, kurus izmantos cikla
        String beigtIzvele = ""; //izvele beigt speli
        String burts = "";//minamais burts
        
        System.out.println(spele.vardaSlepsana(vards));//noslepj vardu
        
        //cikls turpinas, kamer ir palikusas dzivibas un speletajs nav izlemis beigt speli
        while(!beigtIzvele.equals("Y")){
            //cikls turpinas tik ilgi, kamer ievadits tikai viens burts          
            while(burts.length() != 1){
                burts = spele.ievadaDatus(2);
                if (burts.length() > 1){
                    System.out.println("Atlauts ir ievadits tikai vienu simbolu!");
                    continue;
                }
                if (spele.vaiIrSkaitlis(burts)){ //ievadito skaitli nomaina ar garaku vardu
                                                 //lai cikls turpinatos
                    System.out.println("Izvelies tikai burtu!");
                    burts = "skaitli";
                }
                if (spele.vaiAtkartojas(burts)){
                    System.out.println("Tads burts jau ir minets!");
                    System.out.println("Izvelies citu burtu");
                    burts = "cits burts";
                }
            }    
            
            //parbauda vai ievaditais burts sakrit ar kadu no minama varda burtiem un 
            //tad veic atbilstosas izmainas
            if(!spele.vaiSakrit(vards, burts)){
                System.out.println("Ievaditais burts nesakrit ne ar vienu no dota varda burtiem!");
                System.out.println("Tu zaude dzivibu!");
                System.out.println("Tagad Tev ir " + (--atlikushasDzivibas) + " dzivibas!");
                if(atlikushasDzivibas == 0){
                    System.out.println("Tu esi zaudejis!");
                    break;
                }
            } else {
                System.out.println("Tu uzmineji!");
                System.out.println("Tev paliek " + atlikushasDzivibas + " dzivibas!");
            }
            
            System.out.println("Minamais vards: " + spele.uzminetieBurti(vards));//izvada situaciju
            //ar minamo vardu
            
            //iziet no cikla, ja ir uzminets viss vards
            if(spele.vaiIrUzminets(vards)){
                System.out.println("Vards ir uzminets!");
                System.out.println("Tu esi uzvarejis!");
                break;
            }
            
            burts = "";//nodzes burta vertibu
            beigtIzvele = spele.ievadaDatus(3);//lietotajs izvelas vai turpinat speli
        }
    }
    
}
