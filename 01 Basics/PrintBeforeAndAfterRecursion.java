import java.util.*;

public class Main {
  public static void fun(int n){
    if(n==0){
      return ;
    }
    System.out.println(n+" ");  //before recursion
    fun(n-1);
    System.out.println(n+" ");  //after recursion
   
  }
    public static void main(String[] args) {
      fun(3);
    }
}
