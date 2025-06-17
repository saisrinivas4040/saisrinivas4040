package Arrays;

public class FInd2ndSmallestElemnt {
	public static void main(String[] args) {
		int []a= {6,7,1,2};
		int smallest=a[0];
		int secSmallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=smallest && a[i]<secSmallest)
			{
				secSmallest=a[i];
				
			}
		}
		System.out.println(secSmallest);
		
		
		
	}

}
