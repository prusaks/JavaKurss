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
    public int saskaitit(int skaitlis1, int skaitlis2) {
        return skaitlis1 + skaitlis2;
    }

    @Override
    public int atnemt(int skaitlis1, int skaitlis2) {
        return skaitlis1 - skaitlis2;
    }

    @Override
    public int reizinat(int skaitlis1, int skaitlis2) {
        return skaitlis1 * skaitlis2;
    }

    public int vienads(int skaitlis1, int skaitlis2){
        switch(operacija){
            case "+":
                return saskaitit(skaitlis1, skaitlis2);
            case "-":
                return atnemt(skaitlis1, skaitlis2);
            case "*":
                return reizinat(skaitlis1, skaitlis2);
            case "=":
                return  skaitlis1;
            default:
                return 0;
        }
    }
}
