package Arrays;

public class CountOfDifferentElements  {
	public static void main(String[] args) {
		int []a= {1,2,3,5,6,7,1,2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean isPreviousPresent=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					isPreviousPresent=true;
					break;
				}
			}
			if(isPreviousPresent==false)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
