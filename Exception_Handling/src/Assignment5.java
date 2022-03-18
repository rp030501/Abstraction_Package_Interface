class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		System.out.println("Invalid age");
	}
}
public class Assignment5 {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		String name=args[0];
		int age=Integer.parseInt(args[1]);
		try {
			if(age<18||age>=60) {
				throw new InvalidAgeException();
			}
			else {
				System.out.println("Name: "+name+" | "+"Age:  "+age);
			}
		}
		catch(Exception e) {	
		}
	}
}

