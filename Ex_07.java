import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número.
Faça um programa que leia 5 números e informe a soma e a média dos números.
*/

public class Ex_07{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int media = 0;
        int num;
        int count = 0;
        int maior = 0;
        while(count < 5){
        System.out.println("Numero: ");
        num = scan.nextInt();
        if(num > maior)maior = num;
       
        media = media + num;
        count += 1;
        }
        System.out.println("Maior número: " + maior);
       System.out.println("Média: " + (media) / 5); 
    }
}