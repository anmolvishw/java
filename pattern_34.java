package anmol_java_pattern;

public class pattern_34 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			
			if(i%2==0) {
			for(int j=1; j<=i;j++){
				 System.out.print(" "+j);
			}}
			else
			{
				for(int j=1; j<=i; j++) {
					System.out.print(" "+ch);
					ch++;
				}
			}
			
			System.out.println();
		}
	}

}
