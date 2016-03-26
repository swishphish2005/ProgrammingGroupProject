package groupProgrammingProject;

public class Question extends Quiz implements IEditQuiz {

	private String question;
	
	private ArrayList anwsers;

	public ArrayList getAnwsers() {
		return anwsers;
	}

	public void setAnwsers(ArrayList anwsers) {
		this.anwsers = anwsers;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void getQuestionFinal(){
		
	}
	
}

