import java.util.Scanner;

public class Main
{
    public static int multiply(int c, int d){
        int e =c*d;
        return e;
    }
	public static void main(String[] args) {
	    //reversing array
	    Scanner s=new Scanner(System.in);
	  int result =multiply(2,3);
      System.out.print(result);	     
	}
}
//See here we have created a function 
//we have given a function return type and function name with parameters 
//then in main function we have called that function with arguments.
// finally the function will return the value to that main function and we can print the value.
//In thus example we have multiplied two numbers using function.