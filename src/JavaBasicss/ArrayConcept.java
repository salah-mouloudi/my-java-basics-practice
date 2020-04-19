package JavaBasicss;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array: to store similar data type value in a array variable
		
		   //1 . int array:
		     // lowest bound/index = 0
		     // upper bound/index = n-1 (n is the size of array)
	
		
		int i []= new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException 
		
		System.out.println(i.length); // size length of array
		
		//print all the values of array: use the loop
		
		for (int j=0; j<4;j++) {
			
			System.out.println(i[j]);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
