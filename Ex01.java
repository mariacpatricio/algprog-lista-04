import java.util.Scanner;
public class Ex01 {
    public static void main (String[] args) {
        int nota;

        Scanner veja = new Scanner(System.in);
        System.out.println("Digite uma nota");
        nota = veja.nextInt();

        while (nota < 0 && nota > 10) {
            System.out.println("Número inválido");
            System.out.println("Digite um valor válido: ");
            nota = veja.nextInt();
        }

        System.out.println("O número escolhido é: " + nota);



}


}