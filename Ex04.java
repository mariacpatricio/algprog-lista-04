import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        double paísA = 80000;
        double paísB = 200000;
        int anos = 0;

        while (paísA < paísB) {
            paísA = paísA * 1.03;
            paísB = paísB * 1.015;
            anos++; }

            System.out.println("Foram necessários  " + anos + " anos");


    }
    
}
