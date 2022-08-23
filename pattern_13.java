package anmol_java_pattern;

public class pattern_13 {

	public static void main(String[] args) {
		int temp=1;
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" "+temp);
				temp++;
			}
			System.out.println();
		}
	}

}
