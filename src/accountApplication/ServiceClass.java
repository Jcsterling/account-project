package accountApplication;

import java.util.HashMap;

public class ServiceClass {
	
	
	
	private HashMap<Integer, AccountClass> hmap  = new HashMap<Integer, AccountClass>();
	private int newID = 0;
	
	public void addNewAcc(String firstName, String lastName, int accountNumber) {
		AccountClass account = new AccountClass(firstName, lastName, accountNumber );
		
		
		hmap.put(newID, account);
		
		newID++;
		
		
	}
	
	
	

}
