package anmol_java_pattern;

public class pattern_26 {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for (int j=i; j>=0; j--)
			{
				System.out.print(" "+j);
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
