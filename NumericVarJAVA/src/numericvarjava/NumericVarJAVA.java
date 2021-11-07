
package numericvarjava;
import java.util.Scanner;
public class NumericVarJAVA {

    public static void main(String[] args) {
       int watashi_desu = 1;
      
               // READS LEFT TO RIGHT
               // 
       System.out.println(watashi_desu ++); // would print watashi_desu 
       System.out.println(++watashi_desu); // would print watashi_desu + itself 3 times 
       

       // FOR LOOP
       for (int k = 1; k <= 100; k = k + 1){
       // first initialize k, then add a condition to stop then increment the statement
       // what - when - how
       System.out.println(k);
       
       }
       
       // WHILE LOOP
       int num = 1;
       while (num != 0){
           Scanner in = new Scanner(System.in);
           System.out.println("Input 0");
           num = in.nextInt();
           
       }

      
    }
    
}
