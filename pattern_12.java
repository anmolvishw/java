package anmol_java_pattern;

public class pattern_12 {
	public static void main(String[] args)
	{
		int temp=1;
		for (int i=0; i<=5; i++)
		{
			for(int j=0; j<=8-i; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				// condition for using IF- Else
				
				if (i==0 || j==0)
					temp=1;
				else
					temp=temp*(i-j+1)/j;
				System.out.print("   "+temp);
			}
			System.out.println();
		}
	}
}
