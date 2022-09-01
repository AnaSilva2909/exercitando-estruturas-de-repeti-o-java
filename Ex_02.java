import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        System.out.println("Digite o usuário: ");
        nome = scan.next();

        System.out.println("Digite a senha: ");
        senha = scan.next();

        while (nome.equals(senha)){
        System.out.println("Erro, senha e usuarios não podem ser iguais. Digite novamente: ");
        System.out.println("Digite o usuário: ");
        nome = scan.next();

        System.out.println("Digite a senha: ");
        senha = scan.next();
        }
        
         System.out.println("Sucesso!");
    }
    
}
