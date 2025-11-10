import java.util.Scanner;
//In this problem we have reversed array by swapping first and last element
//then second and second last element and so on till we reach middle of array
//Finally we have printed the reversed array

public class Main
{
	public static void main(String[] args) {
	    //reversing array
	    Scanner s=new Scanner(System.in);
	  int arr[]={10,20,49,78,90,9,43};
	  int ll=arr.length-1;
	  int last=arr[ll];
	  for(int i=0;i<=arr.length/2;i++){
	      int temp=arr[i];
	      arr[i]=arr[ll];
	      arr[ll]=temp;
	      ll--;
	  }
	  //printing Array
	  for(int i=0;i<arr.length;i++){
	      System.out.print(arr[i]+" ");
	  }
    
	}
}