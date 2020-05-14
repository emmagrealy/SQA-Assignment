import java.util.ArrayList;

public class Survey {

	//Name 
	private String name;
	//Collection
	private ArrayList<Questions> questions = new ArrayList<Questions>();

	//Constructor
	public Survey(String name, ArrayList<Questions> questions) {
		this.name = name;
		this.questions = questions;
	}

	//Empty Constructor
	public Survey() 
	{
		
	}



	public void addQuestion(Questions quest)
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

}