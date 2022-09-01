/*
 * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */

public class Ex_08 {
    public static void main(String[] args) {
        
        int num = 0;
        int count = 0;

        while(count < 50) {
            num += 1;
            if ( num % 2 != 0){
                System.out.println("Numeros impares: " + num);
            }
     
            count += 1;
                          
        }
    }
}
