import java.util.*;

public class Solution {
  public static boolean isSorted(int[]arr,int n,int index){
    if(index==n-1){
      return true;  //base case
    }
    if(arr[index]>arr[index+1]){
      return false;
    }
    return isSorted(arr,n,index+1);  //recursive call

  }
    public static void main(String[] args) {
      int []arr={1,2,5,6};
      System.out.println(isSorted(arr,arr.length,0));
    }
}
