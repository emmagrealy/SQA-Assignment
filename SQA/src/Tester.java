import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

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

		Survey survey = new Survey("My Questions", null);
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
		SurveyResponse surveyRes = new SurveyResponse(null);
		assertTrue("Should be an object of type 'Survey Response'",surveyRes instanceof SurveyResponse);
	}
	
	
	//Test - are answers to a survey response being added
	@Test //Test Attribute
	public void responseAnswer()
	{
		//Survey response object
		SurveyResponse surveyRes = new SurveyResponse(null);
		//set an answer to the survey response
		surveyRes.setAnswer(1);
		assertNotNull("Method should return a value proving that the answer attribute is NOT null" , surveyRes.getAnswer());
	}			
	
	
	//Test - can responses can be detected from questions
	@Test
	public void questionResponse()
	{
		//Create survey
		Survey survey = new Survey();

		//Question objectS
		Questions one = new Questions("Customer Service");

		//Add answers to question responses
		one.getResponse().setAnswer(2);

		//Test - get first questions response answer
		assertEquals("Value should be '2'",2,one.getResponse().getAnswer());
	}
	
	
	//Test - is a survey responses obtained from survey 
	public void surveyResponse()
	{
		//Survey
		Survey survey = new Survey();

		//Question objectS
		Questions one = new Questions("Our Customer Service");
		Questions two = new Questions("Our Product Quality");

		//Add answer to question response
		one.getResponse().setAnswer(2);
		two.getResponse().setAnswer(3);


		//Add questions to survey
		survey.add(one);
		survey.add(two);

		//ArrayList being returned
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3));

		//Test - do the response lists match
		assertArrayEquals("ArrayList should equal [2,3]", expected,survey.getResponses());

	}
} 