package Pattern;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for (int i=1;i<=n;i++)
		{
			for (int k=1;k<=i;k++)
			{
			 System.out.print(" ");
			}
			for (int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
