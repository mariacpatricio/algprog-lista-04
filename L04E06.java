import java.util.Scanner;
public class L04E06
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
        
System.out.println("Deseja os números na vertical ou horizontal?");
String direcao = leia.nextLine();
        
while (!direcao.equalsIgnoreCase("vertical") && !direcao.equalsIgnoreCase("horizontal")) {
System.out.println("Valor inválido. Escolha entre horizontal e vertical.");
irecao = leia.nextLine(); }
      
for (int x = 1; x <=20; x++) {
      
if (direcao.equalsIgnoreCase("vertical")) {
System.out.println(x);
}
        
if (direcao.equalsIgnoreCase("horizontal")) {
System.out.print(x + " ");
} 
}
      
leia.close();
      
}
}
