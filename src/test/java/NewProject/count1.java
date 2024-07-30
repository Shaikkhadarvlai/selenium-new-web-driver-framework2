package NewProject;

public class count1 {

	public static void main(String[] args) 
	{
		String input="Khadar vali12345@#$$$";
		int charectercount=0;
		int numbercout=0;
		System.out.println("Total Characters are="+input.length());
		for(char ch:input.toCharArray())
		{
			if (Character.isLetter(ch))
			{
				 charectercount++;
			}
			else if (Character.isDigit(ch))
			{
				numbercout++;
			}
		}
		System.out.println("Toatal charcter="+charectercount);
		System.out.println("Total numbercout= "+numbercout);
		

	
	}
}
