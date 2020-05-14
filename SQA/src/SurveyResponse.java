import java.util.ArrayList;

public class SurveyResponse {
	
	//ArrayList of questions
	ArrayList<Questions> questions = new ArrayList<Questions>();
	
	//Survey response created -> list of questions from survey passed into the response
	public SurveyResponse(ArrayList<Questions> questions)
	{
		this.questions = questions;
	}
	
	//Method - create a list of responses for each question in survey
	public ArrayList<Integer> getResponses()
	{
		//List - represents the values of each questions response
		ArrayList<Integer> responses = new ArrayList<Integer>();

		//Loop - go through each question in the survey
		for(Questions quest : this.questions)
		{
			int value = quest.getAnswer();
			responses.add(value); //Add value to responses
		}

		//return the response values
		return responses;
	}

}