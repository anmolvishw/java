package anmol_java_pattern;

public class pattern_25 {

	public static void main(String[] args) {
		char ch;
		for(int i=1;i<=5; i++)
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print("  ");
			}
			ch='E';
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+ch);
				ch--;
			}			
			System.out.println();
		}
		
		System.out.println("------------------------------------------------\n "
				+ "\t \tA to Z print \n------------------------------------------------");
		
		ch='A';
		for(int j=65; j<=122;j++)
		{
			System.out.print(" "+ch);
			ch++;
		}
	}

}
