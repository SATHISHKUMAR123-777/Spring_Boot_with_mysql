package New;

public class Missing_Number {
	
	
	public int MissingNUM(int[] a) {
		
		
		int n=a[a.length-1];//8
		int total=(n*(n+1))/2;//36
		int sum=0;
		System.out.println(total);
		
		for(int i=0;i<a.length;i++) {
			 sum +=a[i];
		}
		System.out.println(sum);
		return total -sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Input[]= {1, 3, 4, 5, 6, 7, 8, 9, 10};//7
		
		Missing_Number obj=new Missing_Number();
		
		int missingNumber= obj.MissingNUM(Input);
		
	     System.out.println("The missing number is: " + missingNumber);
		 
	}

}
