import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KattisPalindrome
{
	public static void main (String[] args)
	{
		Set<String> pals1;
		char[] lineX;
		ArrayList<String> pals;
		boolean isPal;
		String testee="";
		
		Scanner keyboard= new Scanner(System.in);

		while(keyboard.hasNextLine())
		{
			testee= keyboard.nextLine();
			//System.out.println("\n"+testee);
			if(testee.length()==1)
			{
				//must be atleast 2 long to qualify
				continue;
			}

			pals1= new HashSet<>();
			lineX= testee.toCharArray();
			for(int x=0; x<lineX.length-1;x++)
			{
				for(int y=x+1; y<lineX.length;y++)
				{	
					//System.out.println(testee.substring(x,y+1));
					isPal=pal(lineX,x,y);
					if(isPal)
						pals1.add(testee.substring(x, y+1));
				}
			}
			if(pals1.size()>0)
			{
				pals= new ArrayList<>(pals1);
				Collections.sort(pals);
				for (String string : pals) 
				{
					System.out.println(string);
				}
				System.out.print("\n");
			}
		}
		keyboard.close();
		
	}	
	public static boolean pal(char[] lineX, int start, int end)
	{
		while(end>start)
		{
			if((lineX[start]!=lineX[end]))
					return false;
			start++;
			end--;
		}
		return true;
	}
		
	
}


