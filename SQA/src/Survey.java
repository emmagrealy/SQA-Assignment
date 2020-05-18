import java.util.ArrayList;
import java.util.Collections;

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
	
	
	public double getAverageDeviation()
	{
		//The sum of all question values - the starting value must be 0
		int totalQuest = 0;

		//Loop through the values to get "sum"
		for(Questions quest:this.questions)
		{
			totalQuest+= quest.getAnswer(); //Add the value from the loop to the total 
		}

		//Calculate the mean
		double mean = (float)totalQuest/this.questions.size();

		//Gathering of absolute deviations
		ArrayList<Double> absoultedeviation = new ArrayList<Double>(); 
		for(Questions quest:this.questions)
		{
			//Math class contains basic methods for performing basic numeric operations 
			double absdev = Math.abs(quest.getAnswer() - mean); //abs - Returns the absolute value of a double value
			absoultedeviation.add(absdev); 						//named absdev variable to not mix up with abs
		}

		//absolute deviation sum
		double totalAbsDev = 0; //starting value must be 0
		for(double dub:absoultedeviation) //The colon is a shortcut for iterating over a collection. 
		//The variable on the left of the colon is a temporary variable containing a single element from the collection
		//on the right. With each iteration through the loop, Java pulls the next element from the collection 
		//and assigns it to the temp variable.
		{
			totalAbsDev+=dub; //adding deviation to the starting 0 value
		}

		//average deviation
		double averageDev = Math.round((float)totalAbsDev/this.questions.size() * 100.0)/100.0;
		//round - Returns the closest long to the argument, with ties rounding to positive infinity. 

		return Double.valueOf(averageDev); // Returning averageDev

	}
	
	public int getMaxValue()
	{
		int maxValue = 0;
		ArrayList<Integer> valueList = new ArrayList<Integer>(); //ArrayList of values

		for(Questions quest : this.questions) //The colon is a shortcut for iterating over a collection. 
		{
			valueList.add(quest.getAnswer()); 
		}
		maxValue = Collections.max(valueList); 
		//Max - Returns the maximum element of the given collection, according to the natural ordering of its elements. 
		return maxValue; // return Max Value
	}

} 