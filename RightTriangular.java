import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
 for(int i=1;i<=3;i++){
     //spaces
     for(int j=1;j<=3-i;j++){
         System.out.print(" ");
     }
     //numbers
     for(int k=1;k<=i;k++){
         System.out.print(k);
         
     }
     System.out.println("");
 }
	}
}
//right angled triangular pattern
//   1
//  12
// 123
