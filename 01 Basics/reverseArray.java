import java.util.*;
public class Main {
  public static void reverseArray(int[]arr,int n,int i){
    if(i>=n/2){
      return;
    }
    int temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
    reverseArray(arr,n,i+1);
  }
    public static void main(String[] args) {
      int arr[]={1,2,4,6};
      reverseArray(arr,arr.length,0);
      System.out.println(Arrays.toString(arr));
    }
}
