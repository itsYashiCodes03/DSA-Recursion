import java.util.*;

public class Main {
  public static int reverse(int n,int rev){
    if(n==0){
      return rev;
      }//base case 
      int digit = n % 10;
        rev = rev * 10 + digit;

        return reverse(n / 10, rev);


    //recursive call
      
  }
  static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }
}
