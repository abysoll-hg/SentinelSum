import java.util.*;

public class SentinelSum {
   public static void main(String[] args) {
      int total = 0;
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a number or -1 to stop: ");
      int n = scan.nextInt();
      while (n != -1) {
         System.out.println("You entered: " + n);
         total += n;
         System.out.print("Enter another number or -1 to stop: ");
         n = scan.nextInt();
      }
      System.out.println(total);
   }
}