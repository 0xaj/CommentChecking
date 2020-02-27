public class CommentChecking{

public static void main(String[] args)
		{

			//creating a character array of bad words which can be taken input from a file with all the bad words

    			String badWords="mad retard mental idiot";
    			
    			String[] badWordsArray=badWords.split(" ");
				
			// here i am giving the build-in input but it can be taken from textfield using getElementById, or take input during runtime using scanner
			String input="President of Russia is retard";
			
			String[] inputArray= input.split(" ");

			boolean isProfanity =false;
			
			for(int i=0;i<=inputArray.length-1;i++)
				{
					for(int j=0;j<=badWordsArray.length-1;j++)
						{
							if(inputArray[i].equals(badWordsArray[j]))
								{
									System.out.println("found bad word" + " "+badWordsArray[j]);
									isProfanity =true;
								}

						}

				}

			if(!isProfanity)
				{
					
					System.out.println("No profanity found");
					
				}

		}

}