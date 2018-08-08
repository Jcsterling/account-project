package accountApplication;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainClass {


	
	static AccountClass account;


	public static void main(String[] args) {
		
		
		ServiceClass service = new ServiceClass();	
		service.addNewAcc("jim", "bob", "1738");
		service.addNewAcc("buk", "low", "1414");
		
			
		AccountClass account = service.getAnID(1);
		
		HashMap<Integer, AccountClass> hmap  = service.getHmap();
		
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = prettyGson.toJson(hmap);
		System.out.println("\nPretty JSONObject ==> " + prettyJson  );
		
		
		System.out.println("****** ****** ****** ****** ****** ****** ***** ******");
		
		
		String prettyJsonSelectOnePerson = prettyGson.toJson(account);
		System.out.println("\nPretty JSONObject ==> " + prettyJsonSelectOnePerson );

		
		
		
			
//		System.out.println(account.getFirstName());
//		System.out.println(account.getLastName());
//		System.out.println(account.getAccountNumber());
//			
		
	}
	
	
}
