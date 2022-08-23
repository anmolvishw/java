package anmol_java_pattern;

public class pattern_31 {
	public static void main(String[] main) {
		for (int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" *");
			}
			for (int j=1;j<=2*(5-i);j++)
			{
				System.out.print("  ");
			}

			for(int j=1; j<=i; j++)
			{
				System.out.print(" *");
			}
		System.out.println();
		}
	}
}
