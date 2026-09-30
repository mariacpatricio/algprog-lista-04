import java.util.Scanner;
public class L04E08 {
    public static void main(String[] args) {
        
Scanner leia = new Scanner(System.in);
                
System.out.println("Digite o primeiro número:");
double numero1 = leia.nextDouble();
        
System.out.println("Digite o segundo número:");
double numero2 = leia.nextDouble();
        
System.out.println("Digite o terceiro número:");
double numero3 = leia.nextDouble();
        
System.out.println("Digite o quarto número:");
double numero4 = leia.nextDouble();
      
System.out.println("Digite o quinto número:");
double numero5 = leia.nextDouble();
        
double soma = numero1 + numero2 + numero3 + numero4 + numero5;
double media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
        
System.out.println("A soma dos números " + soma);
System.out.println("A média dos números " + media);
        
leia.close();

}
}