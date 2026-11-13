import java.util.*;

public class Main {
    public static void count(int num) {
      if(num==0){
        return;
      }
      System.out.println(num);
      count(num-1);
    }
    public static void main(String[]args){ 
      count(5);

    }
}
