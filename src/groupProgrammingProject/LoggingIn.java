package groupProgrammingProject;

import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoggingIn extends Application implements EventHandler{

	Button loginButton;
	Button registrationButton;
	TextField userNameInput;
	TextField userPassword;
	TextField userEmailAddress;
	TextField adminPin;
	Label userName;
	Label passWord;
	Label emailAddress;
	Label submit;
	Label adminID;
	StackPane stackPane;
	

	public static void main(String[]args){
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		loginButton = new Button();
		loginButton.setText("Login");
		//adminPin = new TextField();
		userNameInput = new TextField();
		userPassword = new TextField();
		//userEmailAddress = new TextField();
		userName = new Label();
		passWord = new Label();
		//emailAddress = new Label();
		submit = new Label();
		//adminID = new Label();
		userName.setText("User Name");
		passWord.setText("Password");
		//emailAddress.setText("Email Address");
		registrationButton = new Button();
		
		
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(loginButton);
		loginButton.setTranslateY(100);
		loginButton.setTranslateX(-75);
		loginButton.setOnAction(this);
		registrationButton.setOnAction(this);
		registrationButton.setText("Register");
		layout.getChildren().add(registrationButton);
		registrationButton.setTranslateY(100);
		registrationButton.setTranslateX(70);
		layout.getChildren().add(userNameInput);
		userNameInput.setTranslateY(-30);
		layout.getChildren().add(userName);
		userName.setTranslateY(-60);
		userNameInput.setMaxWidth(200);
		layout.getChildren().add(userPassword);
		userPassword.setTranslateY(30);
		layout.getChildren().add(passWord);
		passWord.setTranslateY(0);
		//layout.getChildren().add(adminPin);
		//adminPin.setMaxWidth(200);
		//adminPin.setTranslateY(100);
		//adminID.setText("Admin ID");
		//adminID.setTranslateY(70);
		//layout.getChildren().add(adminID);
		
		userPassword.setMaxWidth(200);
		//layout.getChildren().add(userEmailAddress);
		//layout.getChildren().add(emailAddress);
		//userEmailAddress.setTranslateY(-90);
		//emailAddress.setTranslateY(-120);
		//userEmailAddress.setMaxWidth(200);
		
		Scene scene = new Scene(layout, 300,300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login/Register");
		primaryStage.show();
		
	}

	@Override
	public void handle(Event event) {
		if(event.getSource()== registrationButton){
			StackPane myStackPane = new StackPane();
			Scene newScene = new Scene(myStackPane, 500, 500);
			//primaryStage.setScene(new Scene(myStackPane,500, 500));
			
			Stage SubjectSelectionPage = new Stage();
			SubjectSelectionPage.setTitle("Registration Page");
			SubjectSelectionPage.show();
		}else if (event.getSource() == loginButton){
			userNameInput.setText("Paul");
			StackPane myStackPane2 = new StackPane();
			Scene newScene2 = new Scene(myStackPane2);
			Stage loginSelectionPage = new Stage();
			loginSelectionPage.setScene(newScene2);
			
			
			
			loginSelectionPage.setTitle("Login Selection Page");
			loginSelectionPage.show();
			//SubjectSelectionPage.addC
	   
			//Application.launch(Administrator.class);
		//	Administrator myAdministrator = new Administrator();
		//myAdministrator.start(primaryStage);
		}
		
	}

	
	//private void CloseAction(ActionEvent event) {
    //    Stage stage = (Stage) Close.getScene().getWindow();
    //    stage.close();
    //}
	
	
}
