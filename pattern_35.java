package anmol_java_pattern;

public class pattern_35 {

	public static void main(String[] args) {
			for(int i=1; i<=5; i++)
			{
				for(int j=0; j<=5-i; j++)
				{
					System.out.print("  ");
				}
				for(int j=i; j<=i;j++)
				{
					System.out.print(" "+j);
				}
				for(int j=i*2-1; j>1; j--)
				{
					System.out.print("  ");
				}
				for(int j=i; j<=i;j++)
				{
					System.out.print(" "+j);
				}
				System.out.println();
			}
			
			// lower
			
			for(int i=5; i>=1; i--)
			{
				for(int j=0; j<=5-i; j++)
				{
					System.out.print("  ");
				}
				for(int j=i; j<=i;j++)
				{
					System.out.print(" "+j);
				}
				for(int j=i*2-1; j>1; j--)
				{
					System.out.print("  ");
				}
				for(int j=i; j<=i;j++)
				{
					System.out.print(" "+j);
				}
				System.out.println();
			}
	}

}
