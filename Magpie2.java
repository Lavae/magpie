/**
 * A program to carry on conversations with a human user.

 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no ") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";	
                }
                else if (statement.indexOf("pet") >= 0
                        || statement.indexOf("cat") >= 0
                        || statement.indexOf("dog") >= 0
                        || statement.indexOf("snake") >= 0
                        || statement.indexOf("pets") >= 0)
                {
                    response = "Tell me more about your pets.";
                }
                else if (statement.indexOf("Mr. Blackford") >= 0
                        || statement.indexOf("Blackford") >= 0)
                {
                    response = "He sounds like a good teacher.";
                }
                else if (statement.indexOf("class") >=0
                        || statement.indexOf("classes") >= 0
                        || statement.indexOf("school") >= 0)
                {
                    response = "Tell me more about your classes. What are they like?";
                }
                /*three keywords and three responses*/
                else if (statement.indexOf("thanks") >= 0
                        || statement.indexOf("Thank you") >= 0
                        || statement.indexOf("Thanks") >= 0)
                {
                    response = "You're welcome.";
                }
                else if (statement.indexOf("cold") >=0
                        || statement.indexOf("cloudy") >= 0
                        || statement.indexOf("raining") >= 0
                        || statement.indexOf("snowing") >= 0)
                {
                    response = "Make sure to take a jacket and umbrella out today!";
                }
                else if (statement.trim().length() == 0)
                {
                   response = "Say something, please.";
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
                /*two more noncommittal responses*/
                else if (whichResponse == 4)
                {
                    response = "Lol okay.";
                }
                else if (whichResponse == 5)
                {
                    response = "Cool.";
                }

		return response;
	}
}
