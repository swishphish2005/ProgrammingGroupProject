package groupProgrammingProject;

public class Quiz implements IEditQuiz {

	private String id;
	
	private String name;
	
	private String category;
	
	private ArrayList questionBank;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ArrayList getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(ArrayList questionBank) {
		this.questionBank = questionBank;
	}
	
	public Quiz getQuiz(){
		return Quiz;
	}
	
	
}
