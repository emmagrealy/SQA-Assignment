import java.util.ArrayList;

public class Survey {
	
	//Survey
	private String name;
	
	//Collection of Questions
	private ArrayList<Questions> questions = new ArrayList<Questions>();
	
	//Collection of Survey Responses
	private ArrayList<SurveyResponse> responses = new ArrayList<SurveyResponse>();

  //Name of survey
	private String name;
	//Collection to represent questions
	private ArrayList<Questions> questions = new ArrayList<Questions>();

	//Constructor - taking in a name and list of questions
	public Survey(String name, ArrayList<Questions> questions) {
		this.name = name;
		this.questions = questions;
	}
	
	//Empty Constructor
	public Survey() 
	{

	}
	
	
	//Constructor taking in a name
	public Survey(String name) 
	{
		this.name = name;
	}

	//Add method
	
	//Name 
	private String name;
	//Collection 
	private ArrayList<Questions> questions = new ArrayList<Questions>();

	//Empty Constructor
	public Survey() 
	{
		
	}
	

	//Constructor 
	//Constructor - takes in a name and list of questions
	public Survey(String name, ArrayList<Questions> questions) {
		this.name = name;
		this.questions = questions;
	}
	

	//Constructor taking in JUST a name

	//Constructor - takes in a name
	public Survey(String name) {
		this.name = name;

	}
	
	//Add questions
	public void add(Questions q)
	{
		this.questions.add(q);
	}
	
	//Getters and setter
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public ArrayList<Questions> getQuestions() 
	{
		return questions;
	}
	
	public void setQuestions(ArrayList<Questions> questions) 
	{
		this.questions = questions;
	}
	
	//METHODS
	
	//Return survey response
	public ArrayList<SurveyResponse> getResponses()
	{
		return this.responses;
	}
	public void add(Questions quest)
	{
		this.questions.add(quest);
	}

	//Getters and setter 
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

}