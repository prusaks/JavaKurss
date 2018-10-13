package day4;


public class Kalkulators {
    
    public String vards = "tukss";
    
    public void sasakaititVaiAtnemt(String izvele, double sk1, double sk2){
        
        if (izvele.equals("+")){
            System.out.println(sk1 + " + " + sk2 + " = " + saskaitisana(sk1, sk2));
        } else if(izvele.equals("-")) {
            System.out.println(sk1 + " - " + sk2 + " = " + atnemsana(sk1, sk2));
        } else {
            System.out.println("Nekadas darbibas netiks veiktas!");
        }
        
    }
    
    private double saskaitisana(double sk1, double sk2){
        return sk1 + sk2;
    }
    
    private double atnemsana(double  sk1, double sk2){
        return sk1 - sk2;
        
    }

}
