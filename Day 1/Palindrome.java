package Pattern;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for (int  k=1;k<=n-i;k++)
			{
				System.out.print(".");
			}
			for(int j=i;j>=1;j--)
			{
			System.out.print(j);
			}
			for (int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
