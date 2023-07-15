package Pattern;

public class ReverseLefthalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i=n;i>=1;i--)
		{
			for (int k=n;k>i;k--)
			{
				System.out.print(".");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
