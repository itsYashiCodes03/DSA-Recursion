import java.util.*;
public class Solution{
    public static int Sum(int n){
        if(n==0){
            return 0;  //base case
        }
        return n+Sum(n-1);  //recursive call
    }
    public static void main(String[]args){
        int n=5;
        int res=Sum(n);
        System.out.println(res);
    }
}
