public class Main
//here we have given an array and in that array we have find a specific element is present at which index
//So for that we have iterated over array using for loop  wherever we found that element 
//that index will be printes in output
{
	public static void main(String[] args) {
	 int []arr={10,20,30,40,50,60};
	 int find=30;
	 int index=-1;
	 for(int i=0;i<arr.length;i++){
	     if(arr[i]==find){
	         index=i;
	         break;
	     }
	 }
	if(index!=-1){
	    System.out.println(index);
	}else{
	    System.out.println("element not found");
	    
	    
	    
	}
	}
}