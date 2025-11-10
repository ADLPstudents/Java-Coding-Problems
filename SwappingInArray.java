import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	  int arr[]={10,20,49,78,90,9,43};
	  int temp=arr[arr.length-1];
	  arr[arr.length-1]=arr[0];
	  arr[0]=temp;
	  System.out.println(arr[0]);
	  System.out.print(arr[arr.length-1]);
    
	}
}