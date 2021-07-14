import java.util.*;
import java.lang.*;

public class find_if_pyth_triple {

   public static void main (String [] args) {
   
      Scanner key = new Scanner(System.in);
      int a = key.nextInt();
      int b = key.nextInt();
      double c = Math.sqrt(a*a + b*b);
      String round_c = c + "";
      if (round_c.length() > 6) {
         round_c = round_c.substring(0,5);
      }
      else {
      }
      if (c == (int)c) {
         System.out.println(a + ", " + b + ", and " + (int)c + " is a pythagorean triple.");
      }
      else {
         System.out.println(a + ", " + b + ", and ~" + round_c + " is NOT a pythagorean triple.");  
      }
   }
}