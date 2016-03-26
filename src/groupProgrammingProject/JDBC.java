package groupProgrammingProject;

public class JDBC {

	
	private int characterID;
	
	private static int counter = 0;
	
	public int getCharacterID() {
		return characterID;
	}

	public void setCharacterID(int characterID) {
		
		if(characterID >= 0){
			counter++;
		}
		this.characterID = counter ;
	}
}
