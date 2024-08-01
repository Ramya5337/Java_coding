
public class MissingNumber {

		    public  int findingMissingNumber(int n, int[] arr)
		    {
		        int sum = 0;
                // Calculate the sum of array elements
		        for (int i = 0; i < n - 1; i++) {
		            sum += arr[i];
		        }
		        int sumOfNnumbers = (n * (n + 1)) / 2;

		        // Return the missing number
		        return sumOfNnumbers - sum;
		    }

		    public static void main(String[] args)
		    {
		    	MissingNumber m=new MissingNumber();
		        int[] arr = { 1, 2, 3, 5,4,7};
		        int n = 7;
		       int  result= m.findingMissingNumber(n, arr);
		        System.out.println("missing number in the array"+result);
		    }
}


