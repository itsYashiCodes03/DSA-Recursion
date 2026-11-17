import java.util.*;

public class Solution {
  public static boolean isSorted(int[]arr,int n,int index){
    if(n==1){
      return true;  //base case
    }
    if(arr[n-1]<arr[n-2]){
      return false;
    }
    return isSorted(arr,n-1,index);  //recursive call

  }
    public static void main(String[] args) {
      int []arr={1,2,5,6};
      System.out.println(isSorted(arr,arr.length,0));
    }
}
