
import java.util.*;
//By RK
public class DecimalToAnyBase{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        // write code here

        int multiplier =1;
        int result=0;
        int n=173;
        while(n>0){
            int quotient = n/8;
            int remainder = n%8;

            result = result + (remainder * multiplier);
            //System.out.println(result);
            multiplier *=10;
            n=n/8;
            //System.out.println("------------------");

        }
        return result;
        //System.out.println(result);
    }
}
//By Archit Aggarwal
/*

import java.util.*;

  public class Main{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }

   public static int getValueInBase(int n, int b){
       // write code here

       int res=0;
       int multiplier =1;

       while(n>0){
           int divisor=n/b;
           int remainder =n%b;
           n=divisor;
           res=res +remainder*multiplier;
           multiplier *=10;
       }

       return res;

   }
  }

 */