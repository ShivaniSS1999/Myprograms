
public class ArrayFactorial {
	public static void main(String[] args) {
		int fact=1;
		int arr[]= {1,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			
			fact=fact*arr[i];
		}
	
		for(int i:arr)
			
		System.out.println(fact);
		
		
			
	}
	
}
