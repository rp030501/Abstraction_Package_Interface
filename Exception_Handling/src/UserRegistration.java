import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidCountryException extends Exception{
	public InvalidCountryException() {
		System.out.println("User Outside India cannot be registered");
	}
}

public class UserRegistration {
	public void registerUser(String username,String userCountry) throws InvalidCountryException{
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			throw new InvalidCountryException();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String usName="";
		String CountryName="";
		System.out.println("Enter the User Name");
		usName=sc.next();
		System.out.println("Enter the country Name");
		CountryName=sc.next();
		UserRegistration reg=new UserRegistration();
		try {
			reg.registerUser(usName, CountryName);
		}
		catch (InvalidCountryException e) {
			
		}
	}
}
