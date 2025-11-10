
//Here we have given array and we have a one specific number and that no is repeating for what time that we have to print
//for that we have used a for loop to iterate over array and whenever that number get 
//occurs into aray we increse the count value by 1
//Then finally we will print the count value

public class Main
{
	public static void main(String[] args) {
	 int []arr={10,20,10,40,50,10};
	 int find=10;
	 int index=-1;
	 int count=0;
	 for(int i=0;i<arr.length;i++){
	     if(arr[i]==find){
	         count=count+1;
	         
	     }
	 }
   System.out.print(count);
	    
	    
	    
	}
	}
