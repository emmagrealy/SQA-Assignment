
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Tester {

	//Test - create an empty survey
	@Test //declaring a test
	public void createSurveyEmpty()
	{		
		Survey survey = new Survey();
		assertTrue("Should be an object of type 'survey'",survey instanceof Survey);
	}

	//Test - create a survey with a name and questions
	@Test //declaring a test
	public void createSurvey()
	{		
		//Creation of question object
		Questions one = new Questions("Our Customer Service");
		//Collection to represent questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//adding question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type survey",survey instanceof Survey);
	}
	
	
	
	//Test - see if collection of questions exists within survey object
	@Test
	public void surveyQuestions()
	{		
		//Creation of question object
		Questions one = new Questions("Our Customer Service");
		//Collection to represent questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//adding question to list
		questions.add(one);
		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type arralylist",survey.getQuestions() instanceof ArrayList);
	}
	
	
	//Test - check if questions are being added to the survey
	@Test
	public void addQuestion()
	{
		//Creation of question object
		Questions one = new Questions("Our Customer Service");
		Questions two = new Questions("Our Product Quality");
		
		Survey survey = new Survey("My Questions");
		survey.add(one);
		survey.add(two);

		assertEquals("Length of questions array should be 2",2 ,survey.getQuestions().size());
	}
}