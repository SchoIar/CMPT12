package mathjava;
import java.util.Scanner;
public class MathJAVA {
public static void main(String[] args) {
    Scanner kbInput = new Scanner(System.in);
    // Scanner is the class - kbinput is the object
    // new Scanner(system.in);  is the initilization
    System.out.println("");
    double myNum;
    myNum = kbInput.nextDouble();
    
    if (myNum >= 0){
        // == equals to.
        // || means or AND && means and
        // != means not equals to 
        double myAns = Math.sqrt(myNum);
        // Math is the class
        //.sqrt(x) is the method of the math class
        // x is the parameter (or input) which accepts type double
        // .sqrt(x) has a return type of double
        System.out.println("The square root is " + myAns);
        
                    }
       System.out.println("This is so random" + Math.random());
       
       System.out.println("Entre password: ");
       String myPass = kbInput.nextLine().toLowerCase();
       
       if (myPass.equals("password") == true){
    System.out.println("Sucess");
        }
       else
       {
    System.out.println("Wrong password");
       }
       }
        
    }

    

