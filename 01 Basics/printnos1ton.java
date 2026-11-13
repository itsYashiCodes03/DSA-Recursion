import java.util.*;

public class Main {
    public static void count(int num) {
      if(num==0){
        return; //base case
      }
      count(num-1);//recursive call
      System.out.println(num);
    }
    public static void main(String[]args){ 
      count(5);

    }
}
