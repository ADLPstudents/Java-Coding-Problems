import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
 
 boolean prime=false;
 for(int i=2;i<=n/2;i++){
     
      if(n%i==0){
          prime=true;
          break;
      }
 }
 if(prime){
     System.out.println("no is not a prime no");
 }else{
     System.out.println("no a prime no");
 }
	}
}

//check wheather a no is prime of not by using prime flag into code.
