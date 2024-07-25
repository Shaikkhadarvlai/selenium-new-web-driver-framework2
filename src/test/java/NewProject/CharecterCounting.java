package NewProject;

public class CharecterCounting {

	public static void main(String[] args) 
	{
		 String input = "Swetha123";
	        int letterCount = 0;
	        int numberCount = 0;
         System.out.println("Total charecters and numbers"+input.length());
	        // Iterate through each character in the string
	        for (char ch : input.toCharArray()) 
	        {
	            // Check if the character is a letter
	            if (Character.isLetter(ch)) 
	            {
	                letterCount++;
	            }
	            // Check if the character is a digit
	            else if (Character.isDigit(ch)) 
	            {
	                numberCount++;
	            }
	        }

	        // Output the counts
	        System.out.println("Number of letters: " + letterCount);
	        System.out.println("Number of numbers: " + numberCount);
	    }

		
		
}	

