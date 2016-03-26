package groupProgrammingProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.ArrayList;
import java.util.Random;

public class UserInterface extends Application implements EventHandler<ActionEvent> {

	private static ArrayStorage storageQuizQuestionsandAnwsers = new ArrayStorage();
	
	private static ArrayList<String> quizAnwsers = storageQuizQuestionsandAnwsers.getQuizAnwsers();
	private static ArrayList<String> quizQuestions = storageQuizQuestionsandAnwsers.getQuizQuestions();
	
	int randomNumber;
	StackPane layout;
	StackPane layout2;
	StackPane layout3;
	Button loginPageButton;
	Button registerPageButton;
	Button quizPageAnwserButton1;
	Button quizPageAnwserButton2;
	Button quizPageAnwserButton3;
	Button quizPageAnwserButton4;
	Button quizPageTopicSelectionButton1;
	Button quizPageTopicSelectionButton2;
	Button quizPageTopicSelectionButton3;

	TextField userNameInput;
	TextField passwordInput;
	TextField registrationPageUserNameInput;
	TextField registrationPagePasswordInput;
	TextField registrationPageEmailAddress;
	TextField registrationPageFirstName;
	TextField registrationLastName;
	TextField registrationPageClass;

	TextField quizPageQuestion1;
	TextField quizPageQuestion2;
	TextField quizPageQuestion3;
	TextField quizPageQuestion4;

	Label userNameInputLabel;
	Label passwordInputLabel;
	Label registrationPageUserNameInputLabel;
	Label registrationPagePasswordInputLabel;
	Label registrationPageEmailAddressLabel;
	Label registrationPageFirstNameLabel;
	Label registrationPageLastNameLabel;
	Label registrationPageClassLabel;
	Label quizPageQuestion1Label;
	Label quizPageQuestion1Labe2;
	Label quizPageQuestion1Labe3;
	Label quizPageQuestion1Labe4;
	Label quizPageTopicLabel;

	Button RegistrationPage;
	Button RegistrationPageSubmitButton;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		loginPageButton = new Button("Login");
		registerPageButton = new Button();
		userNameInput = new TextField();
		passwordInput = new TextField();
		userNameInputLabel = new Label();
		passwordInputLabel = new Label();
		registerPageButton = new Button();

		registerPageButton.setText("Register");
		userNameInputLabel.setText("User Name:");
		passwordInputLabel.setText("Password:");

		layout = new StackPane();
		primaryStage.setScene(new Scene(layout, 500, 300));
		primaryStage.setTitle("Total Recall - Login:");
		layout.getChildren().add(loginPageButton);
		layout.getChildren().add(registerPageButton);
		layout.getChildren().add(userNameInput);
		layout.getChildren().add(passwordInput);
		layout.getChildren().add(userNameInputLabel);
		layout.getChildren().add(passwordInputLabel);
		userNameInput.setMaxWidth(200);
		passwordInput.setMaxWidth(200);

		loginPageButton.setTranslateX(50);
		loginPageButton.setTranslateY(50);
		registerPageButton.setTranslateX(-50);
		registerPageButton.setTranslateY(50);
		userNameInput.setTranslateY(-50);
		passwordInput.setTranslateY(0);
		userNameInputLabel.setTranslateX(-150);
		userNameInputLabel.setTranslateY(-50);
		passwordInputLabel.setTranslateX(-150);
		registerPageButton.setOnAction(this);
		loginPageButton.setOnAction(this);
		primaryStage.show();

	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == registerPageButton) {
			Stage RegistrationPage = new Stage();
			layout2 = new StackPane();
			RegistrationPage.setScene(new Scene(layout2, 500, 300));
			RegistrationPageSubmitButton = new Button("Register");
			registrationPageUserNameInput = new TextField();
			registrationPagePasswordInput = new TextField();
			registrationPageEmailAddress = new TextField();
			registrationPageFirstName = new TextField();
			registrationLastName = new TextField();
			registrationPageClass = new TextField();

			registrationPageUserNameInputLabel = new Label("User Name");
			registrationPagePasswordInputLabel = new Label("Password");
			registrationPageEmailAddressLabel = new Label("Email Address");
			registrationPageFirstNameLabel = new Label("First Name");
			registrationPageLastNameLabel = new Label("Last Name");
			registrationPageClassLabel = new Label("Class");

			layout2.getChildren().add(RegistrationPageSubmitButton);
			layout2.getChildren().add(registrationPageUserNameInput);
			layout2.getChildren().add(registrationPagePasswordInput);
			layout2.getChildren().add(registrationPageEmailAddress);
			layout2.getChildren().add(registrationPageFirstName);
			layout2.getChildren().add(registrationPageUserNameInputLabel);
			layout2.getChildren().add(registrationPagePasswordInputLabel);
			layout2.getChildren().add(registrationLastName);
			layout2.getChildren().add(registrationPageClass);
			layout2.getChildren().add(registrationPageEmailAddressLabel);
			layout2.getChildren().add(registrationPageFirstNameLabel);
			layout2.getChildren().add(registrationPageLastNameLabel);
			layout2.getChildren().add(registrationPageClassLabel);

			RegistrationPageSubmitButton.setTranslateX(0);
			registrationPageUserNameInput.setTranslateX(-50);
			registrationPagePasswordInput.setTranslateX(-50);
			registrationPageEmailAddress.setTranslateX(-50);
			registrationPageFirstName.setTranslateX(-50);
			registrationLastName.setTranslateX(-50);
			registrationPageClass.setTranslateX(-50);
			registrationPageUserNameInputLabel.setTranslateX(-200);
			registrationPagePasswordInputLabel.setTranslateX(-200);
			registrationPageEmailAddressLabel.setTranslateX(-200);
			registrationPageFirstNameLabel.setTranslateX(-200);
			registrationPageLastNameLabel.setTranslateX(-200);
			registrationPageClassLabel.setTranslateX(-200);

			RegistrationPageSubmitButton.setTranslateY(130);
			registrationPageUserNameInput.setTranslateY(-100);
			registrationPagePasswordInput.setTranslateY(-60);
			registrationPageEmailAddress.setTranslateY(-20);
			registrationPageFirstName.setTranslateY(20);
			registrationLastName.setTranslateY(60);
			registrationPageClass.setTranslateY(100);

			registrationPageUserNameInputLabel.setTranslateY(-100);
			registrationPagePasswordInputLabel.setTranslateY(-60);
			registrationPageEmailAddressLabel.setTranslateY(-20);
			registrationPageFirstNameLabel.setTranslateY(20);
			registrationPageLastNameLabel.setTranslateY(60);
			registrationPageClassLabel.setTranslateY(100);

			registrationPageUserNameInput.setMaxWidth(200);
			registrationPagePasswordInput.setMaxWidth(200);
			registrationPageEmailAddress.setMaxWidth(200);
			registrationPageEmailAddress.setMaxWidth(200);
			registrationPageFirstName.setMaxWidth(200);
			registrationLastName.setMaxWidth(200);
			registrationPageClass.setMaxWidth(200);

			RegistrationPage.setTitle("Registration");
			RegistrationPage.show();

		} else if (event.getSource() == loginPageButton) {

			//loginPageButton.setOnAction(e->()) 
			
			Stage quizPage = new Stage();
			layout3 = new StackPane();
			quizPage.setScene(new Scene(layout3, 500, 500));
			quizPageAnwserButton1 = new Button("Anwser: 1");
			quizPageAnwserButton2 = new Button("Anwser: 2");
			quizPageAnwserButton3 = new Button("Anwser: 3");
			quizPageAnwserButton4 = new Button("Anwser: 4");
			quizPageTopicSelectionButton1= new Button("Biology");
			quizPageTopicSelectionButton2= new Button("Chemistry");
			quizPageTopicSelectionButton3= new Button("Physics");

			quizPageQuestion1 = new TextField();
			quizPageQuestion2 = new TextField();
			quizPageQuestion3 = new TextField();
			quizPageQuestion4 = new TextField();

			quizPageQuestion1Label = new Label("Question 1:");
			quizPageQuestion1Labe2 = new Label("Question 2:");
			quizPageQuestion1Labe3 = new Label("Question 3:");
			quizPageQuestion1Labe4 = new Label("Question 4:");
			quizPageTopicLabel = new Label("Subject Selected:");

			layout3.getChildren().add(quizPageAnwserButton1);
			layout3.getChildren().add(quizPageAnwserButton2);
			layout3.getChildren().add(quizPageAnwserButton3);
			layout3.getChildren().add(quizPageAnwserButton4);
			layout3.getChildren().add(quizPageQuestion1);
			layout3.getChildren().add(quizPageQuestion2);
			layout3.getChildren().add(quizPageQuestion3);
			layout3.getChildren().add(quizPageQuestion4);
			layout3.getChildren().add(quizPageQuestion1Label);
			layout3.getChildren().add(quizPageQuestion1Labe2);
			layout3.getChildren().add(quizPageQuestion1Labe3);
			layout3.getChildren().add(quizPageQuestion1Labe4);
			layout3.getChildren().add(quizPageTopicSelectionButton1);
			layout3.getChildren().add(quizPageTopicSelectionButton2);
			layout3.getChildren().add(quizPageTopicSelectionButton3);
			layout3.getChildren().add(quizPageTopicLabel);
			
			
			quizPageAnwserButton1.setTranslateX(-160);
			quizPageAnwserButton2.setTranslateX(-60);
			quizPageAnwserButton3.setTranslateX(40);
			quizPageAnwserButton4.setTranslateX(140);
			quizPageQuestion1.setTranslateX(0);
			quizPageQuestion2.setTranslateX(0);
			quizPageQuestion3.setTranslateX(0);
			quizPageQuestion4.setTranslateX(0);
			quizPageQuestion1Label.setTranslateX(-140);
			quizPageQuestion1Labe2.setTranslateX(-140);
			quizPageQuestion1Labe3.setTranslateX(-140);
			quizPageQuestion1Labe4.setTranslateX(-140);
			quizPageTopicSelectionButton1.setTranslateX(-100);
			quizPageTopicSelectionButton2.setTranslateX(0);
			quizPageTopicSelectionButton3.setTranslateX(100);
			

			quizPageAnwserButton1.setTranslateY(150);
			quizPageAnwserButton2.setTranslateY(150);
			quizPageAnwserButton3.setTranslateY(150);
			quizPageAnwserButton4.setTranslateY(150);
			quizPageQuestion1.setTranslateY(-100);
			quizPageQuestion2.setTranslateY(-60);
			quizPageQuestion3.setTranslateY(-20);
			quizPageQuestion4.setTranslateY(20);
			quizPageQuestion1Label.setTranslateY(-100);
			quizPageQuestion1Labe2.setTranslateY(-60);
			quizPageQuestion1Labe3.setTranslateY(-20);
			quizPageQuestion1Labe4.setTranslateY(20);
			quizPageTopicSelectionButton1.setTranslateY(80);
			quizPageTopicSelectionButton2.setTranslateY(80);
			quizPageTopicSelectionButton3.setTranslateY(80);
			quizPageTopicLabel.setTranslateY(-160);

			quizPageQuestion1.setMaxWidth(200);
			quizPageQuestion2.setMaxWidth(200);
			quizPageQuestion3.setMaxWidth(200);
			quizPageQuestion4.setMaxWidth(200);
			quizPageTopicSelectionButton1.setOnAction(this);
			quizPageTopicSelectionButton2.setOnAction(this);
			quizPageTopicSelectionButton3.setOnAction(this);
			storageQuizQuestionsandAnwsers.setQuizQuestions();
			storageQuizQuestionsandAnwsers.setQuizAnwsers();
			
			
			if(event.getSource() == quizPageTopicSelectionButton1){
				
				randomAnwserPopulation();
				randomQuestionPopulation();
				
			}else if (event.getSource()== quizPageTopicSelectionButton2){
				
				
			}else if (event.getSource()== quizPageTopicSelectionButton3){
				
			}

			quizPage.setTitle("Quiz - Total Recall");
			quizPage.show();
		}
	}

	
	public void randomQuestionPopulation(){
		Random randomGenerator= new Random();
	
		int randomisedQuestion1 = randomGenerator.nextInt(quizQuestions.size());
		int randomisedQuestion2 = randomGenerator.nextInt(quizQuestions.size());
		int randomisedQuestion3 = randomGenerator.nextInt(quizQuestions.size());
		int randomisedQuestion4 = randomGenerator.nextInt(quizQuestions.size());
		
		quizPageQuestion1.setText(quizQuestions.get(randomisedQuestion1));
		quizPageQuestion2.setText(quizQuestions.get(randomisedQuestion2));
		quizPageQuestion3.setText(quizQuestions.get(randomisedQuestion3));
		quizPageQuestion4.setText(quizQuestions.get(randomisedQuestion4));
	}
	
	
	public void randomAnwserPopulation(){
		Random randomGenerator= new Random();
		
		int randomisedAnwser1 = randomGenerator.nextInt(quizAnwsers.size());
		int randomisedAnwser2 = randomGenerator.nextInt(quizAnwsers.size());
		int randomisedAnwser3 = randomGenerator.nextInt(quizAnwsers.size());
		int randomisedAnwser4 = randomGenerator.nextInt(quizAnwsers.size());
		
		quizPageAnwserButton1.setText(quizAnwsers.get(randomisedAnwser1));
		quizPageAnwserButton1.setText(quizAnwsers.get(randomisedAnwser2));
		quizPageAnwserButton1.setText(quizAnwsers.get(randomisedAnwser3));
		quizPageAnwserButton1.setText(quizAnwsers.get(randomisedAnwser4));
	}
	
	
}
