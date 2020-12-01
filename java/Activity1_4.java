package JavaActivity3;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {3,1,6,8,9,22,44,2,7};
		int count = array.length;
		System.out.println("Array of numbers before sorting");
		printarray(array,count);
		ascendsort(array,count);
		System.out.println("Array of numbers after sorting");
		printarray(array,count);
		
	}

	public static void printarray(int p[],int length)
	{
		for (int i=0; i<length; i++)
			System.out.println(p[i]);
	}
	
	static void ascendsort(int p[],int length)
	{
		for (int i=1; i<length; i++)
		{
			int x= p[i];
			int j = i - 1;
	        
	        while (j >= 0 && x < p[j]) {
	            p[j + 1] = p[j];
	            --j;
	        }
	        p[j + 1] = x; 
		}
	}
}

