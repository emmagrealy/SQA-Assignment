import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Tester {

	//Test - create an empty survey
	@Test
	public void createSurveyEmpty()
	{		
		Survey survey = new Survey();
		assertTrue("Should be an object of type survey",survey instanceof Survey);
	}

	//Test - create a survey with a name and questions
	@Test
	public void createSurvey()
	{		
		//Creation of question object
		Questions one = new Questions("Customer Service");
		//Collection representing questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//Add question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type survey",survey instanceof Survey);
	}
	
	
	//Test - does a collection of questions exists within the survey objects
	@Test
	public void surveyQuestions()
	{		
		//Question object
		Questions one = new Questions("Our Customer Service");
		//Collection representing questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//Add question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type 'ArrayList'",survey.getQuestions() instanceof ArrayList);
	}
}