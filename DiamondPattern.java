import java.util.Scanner;
// This is a diamond pattern program here we have used scanner function to fetch n value from user
//then we found pattern in first half of diamond spaces and stars similarly  we did for second half of a diamond
// For printing we identified that we have to use n value for printing blank spaces and stars.
//for n=5
//  *
// ***
//*****
// ***
//  *
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
      
      int spaces1=n/2;
      int star1=1;
     //first half of diamond pattern
     for(int i=1;i<=(n+2)/2;i++){
         //for spaces
        for(int j=1;j<=spaces1;j++){
            System.out.print(" ");
        }
        //for stars
        for(int k=1;k<=star1;k++){
            System.out.print("*");
        }
       spaces1--;
       star1=star1+2;
       System.out.println("");
         
     }
     // for second half
     int spaces2=1;
     int star2=n-2;
     for(int i=1;i<=n/2;i++){
          //for spaces
          for(int j=1;j<=spaces2;j++){
              System.out.print(" ");
          }
          //for stars
          for(int k=1;k<=star2;k++){
              System.out.print("*");
          }
          spaces2++;
          star2=star2-2;
         
         System.out.println("");
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}
}