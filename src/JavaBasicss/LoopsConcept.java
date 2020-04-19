package JavaBasicss;

public class LoopsConcept {

	public static void main(String[] args) {
		
	// 1. while loop :
		 
		// dis-advantage of while loop: it will generate infinite loop if we don"t give incrementa/decremental part 
		
		int i=1; // initialization part
		while (i<=10) { // conditional part
			
		System.out.println(i);
		
		i=i+1; // incremental / decremental // and i=i+1 can be written as i=i++ is the same meaning 
			}
	
	System.out.println("-------------");
		// 2. for loop :	
		 
		
	     for(int j=1;j<=10;j++) // Initialization , Conditional part , Incremental
	     {
	    	 System.out.println(j);
	     }
	     
	     
	     System.out.println("------------");
	     

		// print 10 to 1 ==> 10 9 8 7 6 .... 1
	     //k-- means k = k-1
	     
	     for(int k=10;k>=-10;k--) // Initialization , Conditional , Decremantal
	     {
	    	 System.out.println(k);
	     }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
