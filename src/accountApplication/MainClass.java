package accountApplication;

public class MainClass {


	
	static AccountClass account;


	public static void main(String[] args) {
		
		
		ServiceClass service = new ServiceClass();	
		service.addNewAcc("jim", "bob", "1738");
		service.addNewAcc("buk", "low", "1414");
		
		
		
		AccountClass account = service.getAnID(0);
		
		
		
		System.out.println(account.getFirstName());
		System.out.println(account.getLastName());
		System.out.println(account.getAccountNumber());
		
		
		
		
		
		
		
	}
	
	

}
