package anmol_java_pattern;

public class pattern_33 {

	public static void main(String[] args) {
		System.out.println(" *");
		for(int i=1; i<=10; i++)
		{
			System.out.print(" *");
			for(int j=1; j<i; j++)
			{
					System.out.print(" ");
			}
			System.out.println(" *");
		}
		for(int i=1; i<=7; i++)
		{
			System.out.print(" *");
		}
	}

}
