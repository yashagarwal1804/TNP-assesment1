//Number Classifier
import java.util.*;
public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        if(num == 0){
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");      
        }
    }
}
