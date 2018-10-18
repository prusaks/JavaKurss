package desas;


public class Laukums {
    
    private String [] [] spelesLaukums;//masivs glabas katru speles laucinu
    
    //konstruktors, kas uztaisa speles sakumsituaciju
    public Laukums(){
        
        System.out.println("Speles sakums!");
        spelesLaukums = new String[3][3];
        
        //aizpilda masivu ar "-"
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                spelesLaukums[i][j] = "-";
            }
        }
    }

    //metode printLaukums() izvada situaciju uz laukuma
    public void printLaukums(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(spelesLaukums[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    //si metode izmaina speles laukumu pec lietotaja ievaditajam koordinatem
    public void mainaLaukumu(int x, int y, boolean speletajs){
        if (speletajs){
            spelesLaukums[x - 1][y - 1] = "x";
        } else {
            spelesLaukums[x - 1][y - 1] = "o";
        }
    }
    
    //si metode parbauda vai laukums ir pilns
    public boolean vaiIrPilns(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (spelesLaukums[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }
    
    //si metode parbauda vai speletaja izveletais laucins ir brivs
    public boolean vaiIrPieejams(int x, int y){
        if (spelesLaukums [x - 1][y - 1].equals("-")){
            return true;
        } else {
            return false;
        }
    }
    
    //parbauda vai ir uzvara
    public boolean vaiIrUzvara(boolean speletajs){
        String zime;
        int cikIrzimju = 0;
        int speletajaNr;
        
        if (speletajs){
            zime = "x";
            speletajaNr = 1;
        } else {
            zime = "o";
            speletajaNr = 2;
        }
        
        //Parbaude pa horizontali
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (spelesLaukums[i][j].equals(zime)){
                   cikIrzimju++;
                   if(cikIrzimju == 3){
                       System.out.println(speletajaNr + ".speletajs ir uzvarejis!");
                       return true;
                   }
                   continue;
                }
                cikIrzimju = 0;
            }
        }
        
        //Parbaude pa vertikali
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 3; i++){
                if (spelesLaukums[i][j].equals(zime)){
                   cikIrzimju++;
                   if(cikIrzimju == 3){
                       System.out.println(speletajaNr + ".speletajs ir uzvarejis!");
                       return true;
                   }
                   continue;
                }
                cikIrzimju = 0;
            }
        }
        
        //Parbaude pa diogonalem
        if(spelesLaukums[0][0].equals(zime)&&spelesLaukums[1][1].equals(zime)&&
                        spelesLaukums[2][2].equals(zime)){
            System.out.println(speletajaNr + ".speletajs ir uzvarejis!");
            return true;
        }
        
        if(spelesLaukums[0][2].equals(zime)&&spelesLaukums[1][1].equals(zime)&&
                        spelesLaukums[2][0].equals(zime)){
            System.out.println(speletajaNr + ".speletajs ir uzvarejis!");
            return true;
        }
        
        return false;
    }
  
     
}
