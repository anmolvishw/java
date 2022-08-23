package anmol_java_pattern;

public class pattern_15 {

	public static void main(String[] args) {
		for (int i=0; i<=5; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print(" *");
			}
			for(int j=0; j<2*(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		// lower
		
		for (int i=5; i>=0; i--)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print(" *");
			}
			for(int j=0; j<2*(5-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
