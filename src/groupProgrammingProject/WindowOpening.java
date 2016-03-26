package groupProgrammingProject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class WindowOpening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

	
	
	quizPageTopicSelectionButton1.setOnAction(new EventHandler<ActionEvent>() {
	    @Override public void handle(ActionEvent e) {
	        Stage biologyPage = new Stage();
	        biologyPage.setTitle("Biology Page");
	        biologyPage.show();
	    }
	});
	
	quizPageTopicSelectionButton2.setOnAction(new EventHandler<ActionEvent>() {
	    @Override public void handle(ActionEvent e) {
	        Stage chemistryPage = new Stage();
	        chemistryPage.setTitle("Chemistry Page");
	        chemistryPage.show();
	    }
	});
	
	quizPageTopicSelectionButton3.setOnAction(new EventHandler<ActionEvent>() {
	    @Override public void handle(ActionEvent e) {
	        Stage physicsPage = new Stage();
	        physicsPage.setTitle("Physics Page");
	        physicsPage.show();
	    }
	});
	
	
}
