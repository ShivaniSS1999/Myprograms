
public class armstrong {
	public static void main(String[] args) {
		int n=1643,sum=0,pow=0,m=n;
		while(n!=0)
		{
			
			n=n/10;
			pow++;
		}
		n=m;
		while(m!=0)
		{
			int rem=m%10;
			int res=1;
			for(int i=0;i<pow;i++)
				res=res*rem;
			sum=sum+rem;
				m=m/10;
		}
				System.out.println(n==sum?"armstrong":"not armstrong");
		}
		
	}


