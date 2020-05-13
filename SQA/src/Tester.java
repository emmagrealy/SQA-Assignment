import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Tester {

	//Test to create an empty survey
	@Test
	public void createSurveyEmpty()
	{		
		Survey survey = new Survey();
		assertTrue("Should be an object of type survey",survey instanceof Survey);
	}

	//Test to create a survey with a name and questions
	@Test
	public void createSurvey()
	{		
		//Creation of question object
		Questions one = new Questions("Customer Service");
		//Collection to represent questions
		ArrayList<Questions> questions = new ArrayList<Questions>();
		//adding question to list
		questions.add(one);

		Survey survey = new Survey("My Questions" ,questions);
		assertTrue("Should be an object of type survey",survey instanceof Survey);
	}
}