
package javaapplication5;
import java.util.Scanner;
public class JavaApplication5 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, Fat=1;
        Scanner LerS= new Scanner (System.in);
        System.out.print("Digite um numero positivo inferior a 32 : ");
N=LerS.nextInt();
for (int M=N; M>=1; M--)
    Fat*=M;
System.out.printf("%d!=%d#", N, Fat);

            
                
        
    }
    
}
