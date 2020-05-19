public class Questions {

	//Question
	private String question;
	private SurveyResponse response;
	
	//int value for survey response answer
	private int answer;

	//Constructor
	public Questions(String questions) {
		this.question = question;
		//this.response = new SurveyResponse();
	}		

	//Getters and setters


	//Constructor
	public Questions(String question) {
		this.question = question;
	}

  //Getters and setters 
	public String getQuestions() {
		return question;
	}

	public void setQuestions(String question) {
		this.question = question;
	}
	
	public SurveyResponse getResponse() {
		return response;
	}

	public void setResponse(SurveyResponse response) {
		this.response = response;
	}
	
	public int getAnswer() 
	{
		return answer;
	}


}