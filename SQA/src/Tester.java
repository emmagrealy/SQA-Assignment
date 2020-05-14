import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Tester {

	//Test - create an empty survey
	@Test
	public void createSurveyEmpty()
	{		
		Survey s = new Survey();
		assertTrue("Should be an object of type 'survey'",s instanceof Survey);
	}

	//Test - create a survey with a name and questions
	@Test //Test Attribute
	public void createSurvey()
	{		
		//Question object
		Questions one = new Questions("Our Customer Service");
		//Collection 
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//Add question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type 'survey'",survey instanceof Survey);
	}
	
	
	//Test - see if collection of questions exists within survey object
	@Test //Test Attribute
	public void surveyQuestions()
	{		
		//Question object
		Questions one = new Questions("Customer Service");
		//Collection 
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//Add question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type 'ArrayList'",survey.getQuestions() instanceof ArrayList);
	}
}