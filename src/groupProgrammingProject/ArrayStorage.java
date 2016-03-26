package groupProgrammingProject;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javafx.scene.control.TextField;

public class ArrayStorage {

	
	private static ArrayList<String> userNameDetails = new ArrayList<String>();
	
	private static ArrayList<String> passwordDetails = new ArrayList<String>();
	
	private static ArrayList<String> quizAnwsers = new ArrayList<String>();
	
	private static ArrayList<String> quizQuestions = new ArrayList<String>();
	
	
	private static ArrayList<int[]> adminID = new ArrayList<int[]>();
	
	
	public ArrayList<int[]> getadminID(){
		return adminID;
	}
	
	
	public ArrayList<String> getUserNames(){
		return userNameDetails;
	}
	
	public ArrayList<String> getPasswords(){
		return passwordDetails;
	}
	
	public void adduserNamesToArray(){
		userNameDetails.add("Paul");
		userNameDetails.add("Jessica");
		userNameDetails.add("Michael");
		userNameDetails.add("Peter");
	}
	
	public void addPasswordsToArray(){
		passwordDetails.add("Tummon");
		passwordDetails.add("Black");
		passwordDetails.add("Clarke");
		passwordDetails.add("McKavanagh");
	}
	
	
	public void setPasswordsToArray(String password){
		passwordDetails.add(password);
	}
	
	
	public void setUserNameToArray(String userName){
		userNameDetails.add(userName);
		
	}
	
	public void setQuizAnwsers(){
		quizAnwsers.add("1.Fish");
		quizAnwsers.add("2.Chocolate");
		quizAnwsers.add("3.Calculator");
		quizAnwsers.add("4.Piano");
	}
	
	public void setQuizQuestions(){
		quizQuestions.add("1.Which of these is an animal?");
		quizQuestions.add("2.Which of these is an electronic device?");
		quizQuestions.add("3.Which of these is a musical instrument?");
		quizQuestions.add("4.Which of these is an item of food?");
	}
	
	public ArrayList<String> getQuizQuestions(){
		return quizQuestions;
	}
	
	public ArrayList<String> getQuizAnwsers(){
		return quizAnwsers;
	}
	
	public void addadminIDs(){
		adminID.add(1, null);
		adminID.add(2, null);
		adminID.add(3, null);
		adminID.add(4, null);
	}
}
