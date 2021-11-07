
package javaapplication5;
import java.util.Scanner;
public class JavaApplication5 {

    
    public static void main(String[] args) {
     Scanner lastln = new Scanner(System.in);
 System.out.println("Input your first name... ");
    String myFirst = lastln.nextLine();
    System.out.println("Input your last name... ");
    String myLast = lastln.nextLine();
    
    if (myFirst == "" || myLast == ""){
        System.out.println("Please input both your first name and your last name");
    }
    else
    {
    String fullName = ("Hello " + myFirst + " " + myLast + "!");
    System.out.println(fullName);
    }
    //END OF First+Last name finder
    
    
     System.out.println("Please input the area of the circle...");
     double area = lastln.nextDouble();
     
    if (area >= 0){
        
         double radius = Math.sqrt(area / Math.PI);
          System.out.println("The radius is " + radius);
         
     }
    else
    {
        System.out.println("Invalid Input");
    }
         
     //END OF CIRCLE RADIUS CALCULATOR
     
    }
    
}
