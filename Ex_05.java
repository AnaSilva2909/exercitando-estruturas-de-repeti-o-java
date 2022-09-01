import java.util.Scanner;

/*Altere o programa anterior(Ex_04) permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.*/

public class Ex_05 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

   double paísA ;
   double paísB ;
   double valorA ;
   double valorB ;
   int  ano = 0;
   int opcao;
   boolean condicao = false;
   
   System.out.println("Digite o primeiro valor de população: ");
   paísA = scan.nextDouble();
   System.out.println("Valor taxa: ");
   valorA = scan.nextDouble();

   System.out.println("Digite o segundo valor de população: ");
   paísB = scan.nextDouble();
   System.out.println("Valor taxa: ");
   valorB = scan.nextDouble();




   while(paísA <= paísB  ){
    paísA = paísA +(valorA /100 )* paísA ;
    paísB = paísB + (valorB /100 ) * paísB;
    ano = ano + 1;
    System.out.println("País A: " + paísA);
    System.out.println("País B: " + paísB);
   } 
   System.out.println("Quantidade de anos necessarios: " + ano);

    while (!condicao ) {
        System.out.println("Desejar realizar outro calculo? ( 1 SIM ou 2 NÃO ");
        opcao = scan.nextInt();
     
        if(opcao == 2)break;
        if(opcao == 1)
            System.out.println("Digite o primeiro valor de população: ");
            paísA = scan.nextDouble();
            System.out.println("Valor taxa: ");
            valorA = scan.nextDouble();
         
            System.out.println("Digite o segundo valor de população: ");
            paísB = scan.nextDouble();
            System.out.println("Valor taxa: ");
            valorB = scan.nextDouble(); 
            while(paísA <= paísB){
                paísA = paísA +(valorA /100) * paísA ;
                paísB = paísB + (valorB /100)* paísB;
                ano = ano + 1;
                System.out.println("País A: " + paísA);
                System.out.println("País B: " + paísB); 
        }
        System.out.println("Quantidade de anos necessarios: " + ano);  

        
    }
       
        
    }
}
