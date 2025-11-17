import java.util.*;

public class RangeOfNumbers {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Start range: ");
      int start = scan.nextInt();
      System.out.print("End range: ");
      int end = scan.nextInt();
      if (end > start) {
         for (int i = start; i < end; i++) {
            System.out.print(i+", ");
         }
         System.out.print(end);
      }
      else if (start > end) {
         for (int j = start; j > end; j--) {
            System.out.print(j+", ");
         }
         System.out.print(end);   
      }
      else {
         System.out.println(start);
     }
   }
}