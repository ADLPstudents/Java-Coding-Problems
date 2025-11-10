import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
 for(int i=1;i<=n;i++){
     //spaces
     for(int j=1;j<=n-i;j++){
         System.out.print(" ");
     }
     //numbers and spaces
     for(int k=1;k<=i;k++){
         System.out.print(k+"_");
         
     }
     System.out.println("");
 }
	}
}

//perfect tringular pattern using nested for loop 

