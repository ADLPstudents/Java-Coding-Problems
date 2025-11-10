import java.util.Scanner;
// here see firstly taken reverse no is 0;
// then we have a formula reverse=reverse*10+rem;
// then we have extract last digit from original number and then added that last digit to the reverse no and 
//every time after this process we are dividing original no by 10 so that last digit is removed from original number
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
     int reverse=0;
     int rem;
     for(;n>0;n=n/10){
         rem =n%10;
         reverse=reverse*10+rem;
     }
     System.out.print(reverse);
	}
}