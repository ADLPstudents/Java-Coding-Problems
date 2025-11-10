import java.util.Scanner;
//Here we have used temp variable to store value of a
// then we have assigned value of b to a
// finally we have assigned value of temp to b
//this is a swapping of two nos program using third variable
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
	   int b=s.nextInt();
	   int temp=a;
	   a=b;
	   b=temp;
	   
	   System.out.print("value of a is"+a+"value of b is"+b);
	   
    
	}
}