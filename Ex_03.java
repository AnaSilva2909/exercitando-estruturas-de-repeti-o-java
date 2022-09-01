import java.util.Scanner;

/*
 Faça um programa que leia e valide as seguintes informações:
   Nome: maior que 3 caracteres;
   Idade: entre 0 e 150;
   Salário: maior que zero;
   Sexo: 'f' ou 'm';
   Estado Civil: 's', 'c', 'v', 'd';
 */

public class Ex_03 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 

       String nome;
       int idade;
       double salario;
       String sexo;
       String estadoCivil;
       boolean condicao = false;

       System.out.println("Nome: ");
       nome = scan.next();
       
       while (nome.length() < 3) {
        System.out.println("Tente novamente,nome tem que ser maior que três caracteres: ");
        System.out.println("Nome: ");
        nome = scan.next();
       }

       System.out.println("Idade: ");
       idade = scan.nextInt();

      while (idade < 0 || idade > 150) {
        System.out.println("Idade inválida: ");
        System.out.println("Idade: ");
        idade = scan.nextInt();
 
      }
    
       System.out.println("Sálario: ");
       salario = scan.nextDouble();

     while (salario <= 0) {
       System.out.println("Tente novamente, digite valor maior que 0: ");
       System.out.println("Sálario: ");
       salario = scan.nextDouble();
     }

     System.out.println("Sexo, f ou m: ");
     sexo = scan.next();

     while (!condicao) {
        if(sexo.equals("f") || sexo.equals("m"))break;
        System.out.println("Sexo, f ou m: ");
        sexo = scan.next();
        
     }
     
     System.out.println("Estado Civil: ");
     estadoCivil = scan.next();
     while (!condicao) {
        
        if(estadoCivil.equals("s") || estadoCivil
        .equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d"))break;
        System.out.println("Estado civil inválido: ");
        
        System.out.println("Estado Civil: ");
        estadoCivil = scan.next();
     }
    }
}
