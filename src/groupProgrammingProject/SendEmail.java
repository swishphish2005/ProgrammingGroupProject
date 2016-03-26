package groupProgrammingProject;

import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

public class SendEmail extends TimerTask {

	public static void main(String[] args) {
		final String username = "paul.tummon75@gmail.com";
		final String password = "Toshiba2005";
		
		Properties myproperties = new Properties();
		myproperties.put("mail.smtp.auth", "true");
		myproperties.put("mail.smtp.starttls.enable", "true");
		myproperties.put("mail.smtp.host", "smtp.gmail.com");
		myproperties.put("mail.smtp.port","587");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticatior(){
			
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
