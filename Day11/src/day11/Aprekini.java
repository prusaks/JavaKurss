package day11;


public class Aprekini implements IAprekini{
    private String operacija;

    public String getOperacija() {
        return operacija;
    }

    public void setOperacija(String operacija) {
        this.operacija = operacija;
    }

    @Override
    public double saskaitit(double skaitlis1, double skaitlis2) {
        return skaitlis1 + skaitlis2;
    }

    @Override
    public double atnemt(double skaitlis1, double skaitlis2) {
        return skaitlis1 - skaitlis2;
    }

    @Override
    public double reizinat(double skaitlis1, double skaitlis2) {
        return skaitlis1 * skaitlis2;
    }

    @Override
    public double dalit(double skaitlis1, double skaitlis2) {
        if(skaitlis2 == 0){
            return 0;
        } else {
            return skaitlis1/skaitlis2;
        }       
    }
    
    public double vienads(double skaitlis1, double skaitlis2){
        switch(operacija){
            case "+":
                return saskaitit(skaitlis1, skaitlis2);
            case "-":
                return atnemt(skaitlis1, skaitlis2);
            case "*":
                return reizinat(skaitlis1, skaitlis2);
            case "/":
                return dalit(skaitlis1, skaitlis2);
            default:
                return skaitlis1;

        }
    }
}
