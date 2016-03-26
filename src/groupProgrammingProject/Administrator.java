package groupProgrammingProject;

import java.util.ArrayList;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Administrator extends Application implements EventHandler {

	
	private static ArrayStorage myArrayStorage = new ArrayStorage();
	
	
	private static ArrayList<String> userNames = myArrayStorage.getUserNames();
	
	private static ArrayList<String> passwords = myArrayStorage.getPasswords();
	
	private static ArrayList<int[]> adminIDs = myArrayStorage.getadminID();
	
	Button submitButton;
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
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		myArrayStorage.addPasswordsToArray();
		myArrayStorage.adduserNamesToArray();
		
		
		
		submitButton = new Button();
		submitButton.setText("Submit Contents");
		adminPin = new TextField();
		userNameInput = new TextField();
		userPassword = new TextField();
		userEmailAddress = new TextField();
		userName = new Label();
		passWord = new Label();
		emailAddress = new Label();
		submit = new Label();
		adminID = new Label();
		userName.setText("User Name");
		passWord.setText("Password");
		emailAddress.setText("Email Address");
		
		
		int pinID = Integer.parseInt(adminPin.getText());
		
		//Create Layout
		StackPane layout = new StackPane();
		layout.getChildren().add(submitButton);
		submitButton.setTranslateY(160);
		submitButton.setOnAction(this);
		
		
		layout.getChildren().add(userNameInput);
		userNameInput.setTranslateY(30);
		layout.getChildren().add(userName);
		userName.setTranslateY(0);
		userNameInput.setMaxWidth(200);
		layout.getChildren().add(userPassword);
		userPassword.setTranslateY(-30);
		layout.getChildren().add(passWord);
		passWord.setTranslateY(-60);
		layout.getChildren().add(adminPin);
		adminPin.setMaxWidth(200);
		adminPin.setTranslateY(100);
		adminID.setText("Admin ID");
		adminID.setTranslateY(70);
		layout.getChildren().add(adminID);
		
		userPassword.setMaxWidth(200);
		layout.getChildren().add(userEmailAddress);
		layout.getChildren().add(emailAddress);
		userEmailAddress.setTranslateY(-90);
		emailAddress.setTranslateY(-120);
		userEmailAddress.setMaxWidth(200);
		
		Scene scene = new Scene(layout, 500,500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Administration");
		primaryStage.show();
		
		//stackPane.getChildren().add(textField);
		//primaryStage.setScene(new Scene(textField,300,300));
		//primaryStage.show();
	}

	@Override
	public void handle(Event event) {
		if (event.getSource() == submitButton){
			
			LoggingIn loginPage = new LoggingIn();
			
			
			
			//if(adminIDs.contains(adminPin.getText())){
			//	myArrayStorage.setPasswordsToArray(userPassword.getText());
				//myArrayStorage.setUserNameToArray(userNameInput.getText());
		//	}else{
			//	userEmailAddress.setText("Sorry Mate");
				//userNameInput.setText(userNames.get(0));
			}
		}
		
	}

//}
