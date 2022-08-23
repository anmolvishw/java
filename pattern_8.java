package anmol_java_pattern;

public class pattern_8 {

	public static void main(String[] args) {
		int temp=0; 
		for(int i=0;i<5; i++)
		{
			for (int j=0;j<5-i; j++)
			{
				System.out.print("  ");
			}
			temp=i+1;
			for(int j=0; j<=i; j++)
			{				
				System.out.print(" "+temp);
				temp++;
			}
		/* int temp1=i+1;
			for(int j=1; j<=i; j++)
			{				
				 System.out.print(" "+temp1);
				 temp1++;
			}
			 */
			for(int j=1; j<=i; j++)
			{				
				 System.out.print(" "+(temp-2));
		temp--;
			}
			System.out.println();
		}
	}

}
