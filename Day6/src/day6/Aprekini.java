package day6;


public class Aprekini {
    
    public double saskaitit(double a, double b){
        double result = a + b;
        return result;
    }
    
    public double atnemt(double a, double b){
        double result = a - b ;
        
        return result;
    }
    
    public double kapinasana(double baze, int pakape){
        double rez = 1;
     
        for(int i = 0; i < pakape; i++){                
            rez *= baze;                
        }
                       
        return rez;
    }
    
    public int faktorializacija(int faktorials){
        int rez = 1;
        for(int i = 1; i < faktorials + 1; i++){
            rez *= i;
        }
        
        return rez;
    }

}
