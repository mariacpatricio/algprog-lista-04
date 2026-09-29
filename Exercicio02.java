import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        String usuario;
        String senha;


        Scanner veja = new Scanner(System.in);
        System.out.println("Digite o nome do usuario");
        usuario = veja.nextLine();

        System.out.println("Digite a senha do usuario");
        senha = veja.nextLine();

        while (usuario.equals(senha)) {
            System.out.println("Seu usuario não pode ser igual a senha");
            System.out.println("Digite o usuario novamente");
            usuario = veja.nextLine();
            System.out.println("Digite a senha novamente");
            senha = veja.nextLine();
        }
        System.out.println("Usuario cadastrado");

    }
}