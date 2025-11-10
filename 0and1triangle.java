import java.util.Scanner;
//0-1 triangle pattern

// firstly here we have used scanner function for taking input from user
//here identify pattern that in odd row at odd position 0 and at even postion 1 is there 
//similarly in even roe att odd position 1 and at even position 0 is there
//for printng we have used nested for loop as below
//0
//10
//010
//1010
//01010
public class Main
{
	public static void main(String[] args) {    

	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
 for(int i=1;i<=n;i++){
     if(i%2==0){
         // for even rows 
           for(int j=1;j<=i;j++){
               if(j%2==0){
                    //for even positon in even row
                    System.out.print("0");
               }else{
               //for odd positon in even row
               
                   
                   System.out.print("1");
                   
               }
               
           }
           System.out.println("");
     }else{
         
         
         
         
         
         // for odd rows
         for(int j=1;j<=i;j++){
             //even position in odd rows
             if(j%2==0){
                 System.out.print("1");
             }else{
                 //odd position in odd rows
                 System.out.print("0");
             }
         }
         System.out.println("");
     }
 }
	}
}