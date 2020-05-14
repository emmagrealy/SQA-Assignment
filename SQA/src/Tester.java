import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
		Questions one = new Questions("Our Customer Service");
		//Collection 
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//Add question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type 'ArrayList'",survey.getQuestions() instanceof ArrayList);
	}
	
	
	//Test - check questions are being added to survey
	@Test //Test Attribute
	public void addQuestion()
	{
		//Question object
		Questions one = new Questions("Our Customer Service");
		Questions two = new Questions("Our Product Quality");

		Survey survey = new Survey("My Questions");
		survey.add(one);
		survey.add(two);

		assertEquals("Length of questions array should be 2",2 ,survey.getQuestions().size());
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