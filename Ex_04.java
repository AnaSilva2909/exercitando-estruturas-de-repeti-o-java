
/*
 Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
 */

public class Ex_04 {
    public static void main(String[] args) {
    
        
   double paísA = 80000;
   double paísB = 200000;
   double taxaPercentualA = 3.00 /100;
   double taxaPercentualB =  1.05/100;
   int  ano = 0;
   
   while(paísA <= paísB){
    paísA = paísA +(taxaPercentualA * paísA) ;
    paísB = paísB + (taxaPercentualB * paísB);
    ano = ano + 1;
    System.out.println("País A: " + paísA);
    System.out.println("País B: " + paísB);
   }
   System.out.println("Quantidade de anos necessarios: " + ano);

       
        
    }
}
