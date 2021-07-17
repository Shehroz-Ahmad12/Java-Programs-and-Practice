package demo_project;

public class question_array {
	public question_array(String questionString, String option1,String option2, String option3, String option4) {
		
		QuestionString = questionString;
		Option1=option1;
		Option2 =option2;
		Option3 =option3;
		Option4= option4;
    }
    public String getQuestionString(){return QuestionString; }

    public void setQuestionString(String questionString){QuestionString = questionString; }

    public String getAnswer() {return Answer;}

    public void setAnswer(String answer){Answer =answer;}

    private String QuestionString;
    private String Answer;
    private String Option1;
    private String Option2;
    private String Option3;
    private String Option4;

}

	
	
	