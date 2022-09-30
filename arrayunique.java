
public class arrayunique {
	public static void main(String[] args) {
		int arr[]=new int[] {11,12,13,11,11,12,14,15};
		int n=arr.length;
		for(int j=0;j<n;j++)
		{
			int key=arr[j],count=0;
			for(int i=0;i<n;i++)
			{
				if(i!=j && key==arr[i])
				{
					count++;
					arr[i]='\0';
				}
			}
				if(count>0 && key!='\0')
					System.out.println(key+" ");
			}
			
		}
	}


