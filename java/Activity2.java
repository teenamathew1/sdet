package JavaActivity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] numbers = {10,77,10,54,-11,10};
		 int count=numbers.length;
		 int sum=0;
		 System.out.println("count of numbers: "+count);
		for (int i=0;i<count;i++)
		{
			System.out.println(numbers[i]);
			if(numbers[i]==10)			
				sum=sum+numbers[i];
		}
		if(sum==30)
			System.out.println("Sum of 10s in the array is 30. Sum= "+sum);
		else
			System.out.println("Sum of 10s in the array is not 30.It is "+sum);

	}

}
