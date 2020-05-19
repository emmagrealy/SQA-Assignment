import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


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
	
	
	//Test - does a collection of questions exists within the survey objects
	@Test

	public void surveyQuestions()
	{		
		//Question object
		Questions one = new Questions("Our Customer Service");

		//Collection 

		//Collection representing questions

		ArrayList<Questions> questions = new ArrayList<Questions>();
		//Add question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type 'ArrayList'",survey.getQuestions() instanceof ArrayList);
	}
	

	
	//Test - check questions are being added to survey
	@Test //Test Attribute
	//Test - check that questions are being added to the survey
	@Test

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
		assertEquals("method should return a value thus proving that the answer attribute is not 0" ,1, surveyRes.getAnswer());
	}
	
	
	//Test - can responses can be detected from questions
	@Test
	public void questionResponse()
	{
		//Create survey
		Survey survey = new Survey();

		//Question objectS
		Questions one = new Questions("Our Customer Service");

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
			//assertArrayEquals("ArrayList should equal [2,3]", expected,survey.getResponses());

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