import java.util.ArrayList;

public class Survey {

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
=======
	
	//Name 
	private String name;
	//Collection 
	private ArrayList<Questions> questions = new ArrayList<Questions>();

	//Empty Constructor
	public Survey() 
	{
		
	}
	
	//Constructor - takes in a name and list of questions
	public Survey(String name, ArrayList<Questions> questions) {
		this.name = name;
		this.questions = questions;
	}
	
	//Constructor - takes in a name
	public Survey(String name) {
		this.name = name;

	}
	
	//Add questions
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