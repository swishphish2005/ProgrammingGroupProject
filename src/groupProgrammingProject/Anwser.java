package groupProgrammingProject;

public class Anwser extends Question implements IEditQuiz {

	private String anwser;
	
	private boolean correct;

	public String getAnwser() {
		return anwser;
	}

	public void setAnwser(String anwser) {
		this.anwser = anwser;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
}
