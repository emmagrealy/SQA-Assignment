import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
	
	//Test to check that questions are being added to the survey
	@Test //declaring a test
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
	
	
	//Test - see if collection of questions exists within survey object
	@Test
	public void surveyQuestions()
	{		
		//Creation of question object
		Questions one = new Questions("Customer Service");
		//Collection to represent questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//adding question to list
		questions.add(one);
		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type arralylist",survey.getQuestions() instanceof ArrayList);
	}
	

	//Test - check that survey response class is created
	@Test //Test Attribute
	public void createSurveyResponse()
	{		
		//New survey response object
		SurveyResponse surveyRes = new SurveyResponse();
		assertTrue("Should be an object of type 'Survey Response'",surveyRes instanceof SurveyResponse);
	}
	
	
	//Test - are answers to a survey response being added
	@Test //Test Attribute
	public void responseAnswer()
	{
		//Survey response object
		SurveyResponse surveyRes = new SurveyResponse();
		//set an answer to the survey response
		surveyRes.setAnswer(1);
		assertNotNull("Method should return a value proving that the answer attribute is NOT null" , surveyRes.getAnswer());
	}			
} 