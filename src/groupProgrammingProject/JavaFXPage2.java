package groupProgrammingProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXPage2 extends Application implements EventHandler<ActionEvent>{

	Button openButton;
	StackPane layout1;
	StackPane layout2;
	Stage homePage;
	
	
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		homePage = new Stage();
		layout2 = new StackPane();
		openButton = new Button("Open New Page");
		homePage.setScene(new Scene (layout2, 500, 500));
		layout2.getChildren().add(openButton);
		homePage.show();
		
		//openButton.setOnAction();
		
	}
	
	public EventHandler<ActionEvent> getNewPage(){
		homePage = new Stage();
		layout2 = new StackPane();
		openButton = new Button("Open New Page");
		homePage.setScene(new Scene (layout2, 500, 500));
		layout2.getChildren().add(openButton);
		homePage.show();
		
	}
	
	
}
