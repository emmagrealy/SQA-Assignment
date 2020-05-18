import java.util.ArrayList;

public class Survey {

	//Survey
	private String name;
	//Collection of questions
	private ArrayList<Questions> questions = new ArrayList<Questions>();
	
	//Collection of Survey Responses
	private ArrayList<SurveyResponse> responses = new ArrayList<SurveyResponse>();

	//Empty Constructor 
	public Survey() 
	{

	}
		
	//Constructor - taking in JUST a name
	public Survey(String name, ArrayList<Questions> questions)
	{
		this.name = name;
		this.questions = questions;
	}


	//Add questions
	public void add(Questions quest)
	{
			this.questions.add(quest);
	}


	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Questions> questions) {
		this.questions = questions;
	}
	
	
	//METHODS

	//Return survey response
	public ArrayList<SurveyResponse> getResponses()
	{
		return this.responses;
	}


	//Add a survey responses object to a survey
	public void addResponse(SurveyResponse survey)
	{
		this.responses.add(survey);
	}

} 