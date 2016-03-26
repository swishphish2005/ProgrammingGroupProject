package groupProgrammingProject;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class JavaFXJDBC extends Application {

	//class vars
	Label lb_status, lb_column1,lb_column2,lb_column3,lb_column4,lb_column5;
	//Button btn_action;
	Button btn_action02;
	TextField txtf_input01;
	TextField txtf_input02;
	TextField txtf_input03;
	TextField txtf_input04;
	TextField txtf_input05;
	
	public static void main(String[] args) {
		//class vars
		launch(args);
	}
	
	@Override
	public void start(Stage episode) throws Exception {
			
		//label and button (declare, assign event to button)
		lb_status = new Label("Submit");
		lb_column1 = new Label("First Name:");
		lb_column2 = new Label("Last Name:");
		lb_column3 = new Label("Class:");
		lb_column4 = new Label("Rank:");
		lb_column5 = new Label("Age:");
		//btn_action = new Button("Change Text");
		btn_action02 = new Button("Create User");
		txtf_input01 = new TextField("");
		txtf_input02 = new TextField("");
		txtf_input03 = new TextField("");
		txtf_input04 = new TextField("");
		txtf_input05 = new TextField("");
		
		
		txtf_input01.setTranslateX(25);
		txtf_input01.setMaxWidth(300);
		txtf_input02.setTranslateX(25);
		txtf_input02.setMaxWidth(300);
		txtf_input03.setTranslateX(25);
		txtf_input03.setMaxWidth(300);
		txtf_input04.setTranslateX(25);
		txtf_input04.setMaxWidth(300);
		txtf_input05.setTranslateX(25);
		txtf_input05.setMaxWidth(300);
		btn_action02.setTranslateX(130);
		btn_action02.setTranslateY(300);
		lb_status.setTranslateX(150);
		lb_status.setTranslateY(290);
		
		lb_column1.setTranslateX(25);
		lb_column2.setTranslateX(25);
		lb_column3.setTranslateX(25);
		lb_column4.setTranslateX(25);
		lb_column5.setTranslateX(25);
		
		//VBox - get and add children
		VBox vbox01 = new VBox();
		vbox01.getChildren().addAll(
				lb_status,btn_action02,
				lb_column1,txtf_input01,
				lb_column2,txtf_input02,
				lb_column3,txtf_input03,
				lb_column4,txtf_input04,
				lb_column5,txtf_input05);
		
		//Scene - link to VBox
		Scene scene01 = new Scene(vbox01,350,400);
			
		//stage - link and show
		episode.setScene(scene01);
		episode.show();
		episode.setTitle("Add User");

		//Button Action 
		btn_action02.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				
				//GUI Feedback
				lb_status.setText("Acquiring input from your TextFields");
				
				
				
				//Get text from your GUI TextFields
				String subString01 = txtf_input01.getText();
				String subString02 = txtf_input02.getText();
				String subString03 = txtf_input03.getText();
				String subString04 = txtf_input04.getText();
				String subString05 = txtf_input05.getText();
				
				//console feedback (in eclipse)
				System.out.println("hero name: " + txtf_input01.getText());
				System.out.println("code name: " + txtf_input02.getText());
				System.out.println("class: " + txtf_input03.getText());
				System.out.println("rank: " + txtf_input04.getText());
				System.out.println("age: " + txtf_input05.getText());
				lb_status.setText("SQL DataBase Action has been started");
				
				
		
				//Concatenate all these inputs into ONE string 
				String string01 = "insert into HEROES values(" + "'" + subString01 + "'," +
				"'" + subString02 + "'," +
				"'" + subString03 + "'," +
				"" + subString04 + "," +
				"" + subString05 + ");";
				
				
				//-------------------------------------------------------------------------------------------------
				//JDBC RELATED CONTENT------------------------------------------------------------------------------
				//Create a new JDBC connection
				Connection con;
				Statement stmt;

							
				try {
					
					//USER YOU WILL NEED TO CHANGE getConnection() FOR YOUR SQL WORKBENCH
					//con = DriverManager.getConnection(your url, "your username", "your password");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root" ,"toshiba");        	
					stmt = con.createStatement();
					
					//1)DROP TABLE
					stmt.executeUpdate("DROP TABLE IF EXISTS heroes;");
					
					//2)CREATE TABLE
					stmt.executeUpdate("CREATE TABLE HEROES "
							+ "(heroName char(32),"
							+ "codeName char(32),"
							+ "class char(1),"
							+ "rank int,"
							+ "age int,"
							+ "primary key(heroName));");
					
					//-------------------------------------------------------------------------------------------
					//MODIFY SQL SERVER DATABASE SCHEMA
					
					//USER, if you want to create and insert into a NEW TABLE, 
			        //just change the name: HEROES to something else
					//currently this SQL code creates a table of 5 columns, 3 rows
			        
					//3)INSERT BEGINNER DATA INTO TABLE
			        stmt.executeUpdate("INSERT into HEROES " + 
			        "values('Saitama','Hero for fun','B',7,25)");//update statement with thing
			
			        stmt.executeUpdate("INSERT into HEROES " + 
					        "values('Genos','Blonde Cyborg','S',14,19)");//update statement with thing
			        
			        stmt.executeUpdate("INSERT into HEROES " + 
			    	"values('Bang','Silver Fang','S',3,81)");//update statement with thing			
					
			        //4)ADD DATA TO THE TABLE WITH A NEW ROW
			        System.out.println(string01);
					stmt.executeUpdate(string01);
			        
					
					System.out.println("The program has executed");
					stmt.close();
					con.close();
					
					} catch(SQLException ex){
						System.err.println("SQLException: " + ex.getMessage());
					}
				
				//END OF JDBC RELATED CONTENT----------------------------------------------------------------
				//-------------------------------------------------------------------------------------------
			}
		});	
	}
}
