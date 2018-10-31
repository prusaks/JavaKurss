package day10_konsole;

public class Day10_Konsole {
    public static final int IZMERS = 4;
    
    public static void main(String[] args) {
        int mas [][] = new int [IZMERS][IZMERS];
        masivaIzmainas1(mas);
        printMasivs(mas);
        masivaIzmainas2(mas);
        printMasivs(mas);
    }
    
    public static int [][] masivaIzmainas1(int[][] mas){
        boolean paraRinda = false;
        for(int i = 0; i < IZMERS; i++){
           for(int j = 0; j < IZMERS; j++){
               if(paraRinda){
                   mas[i][j] = 0;
               } else {
                   mas[i][j] = 1;
               }
           } 
           paraRinda = !paraRinda;
        }
        return mas;
    }
    
    public static int [][] masivaIzmainas2(int[][] mas){
        for(int i = 0; i < IZMERS; i++){
           for(int j = 0; j < IZMERS; j++){
               if(i % 2 == 1){
                   mas[i][j] = 0;
               } else {
                   mas[i][j] = 1;
               }
           } 
        }
        return mas;
    }
    
    public static void printMasivs(int[][] mas){
        for(int i = 0; i < IZMERS; i++){
            for(int j = 0; j < IZMERS; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
