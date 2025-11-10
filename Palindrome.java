import java.util.Scanner;
// So no is palindrome or not means if we read any no from starting side and from last side the number will be same .
// same that happens with words also example  dad ,mom,121,131 etc.
//we have seen reversing no so same procedure we have followed here but after reversing if reversed no and originall
//no are same then it is a palindrome if no then not a palindrome.
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
     //checking palindrome
     if(n==reverse){
        System.out.print("number n is a palindrome");
     }else{
        System.out.print("no is not palindrome");
     }
	}
}