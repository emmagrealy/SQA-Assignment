public class Questions {

	//Question
	private String question;
	private SurveyResponse response;



	//Constructor
	public Questions(String question) {
		this.question = question;
		this.response = new SurveyResponse();
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

} 