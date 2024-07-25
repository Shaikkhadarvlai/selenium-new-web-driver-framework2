package NewProject;

public class Charectercounting2 
{

	public static void main(String[] args)
	{
		String input ="Raholl12345Rahim";
		int letersCount=0;
		int numbersCount=0;
		System.out.println("Total charecters and numbers="+input.length());
		System.out.println("This is Lowercase="+input.toLowerCase());
		for(char ch :input.toCharArray())
		{
			if (Character.isLetter(ch))
			{
				letersCount++;
			}
			else if (Character.isDigit(ch))
			{
				numbersCount++;
			}
		}
		System.out.println("Number of letters:"+letersCount);
		System.out.println("Number of  number:"+numbersCount);
		
		
	}

}
