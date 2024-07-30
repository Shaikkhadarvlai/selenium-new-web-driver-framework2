package NewProject;

import java.nio.file.FileSystem;

public class count_numbers {

	public static void main(String[] args) 
	{
		 String input="khadarvali123456";
				 int characterscount=0;
				 int numberscount=0;


				 for(char ch :input.toCharArray())
				 {
				    if(Character.isLetter(ch))
				 {
				    characterscount++;

				 }
				 else if(Character.isDigit(ch))
				 {
				 numberscount++;
				 }

				 }
				 System.out.println("Total characters are="+characterscount);
				 System.out.print("Total numbers are="+numberscount);


		
	}

}
