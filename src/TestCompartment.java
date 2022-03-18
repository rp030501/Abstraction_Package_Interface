import java.util.Random;

abstract class compartment{
	public abstract String notice();
}
class FirstClass extends compartment{
	@Override
	public String notice() {
		return "You are in First Class Comp";
	}
}
class general extends compartment{
	@Override
	public String notice() {
		return "You are in General Comp";
	}
}
class Ladies extends compartment{
	@Override
	public String notice() {
		return "You are in Ladies Comp";
	}
}
class Luggage extends compartment{
	@Override
	public String notice() {
		return "You are in Luggage Comp";
	}
}
public class TestCompartment {
	public static void main(String[] args) {
		int n=10;
		compartment arr[]=new compartment[n];
		Random rad=new Random();
		for(int i=0;i<n;i++) {
			int randInt=rad.nextInt((4-1)+1)+1;
			if(randInt==1) {
				arr[i]=new FirstClass();
			}
			else if (randInt==2) {
				arr[i]=new Luggage();
			}
			else if (randInt==3) {
				arr[i]=new Ladies();
			}
			else if (randInt==4) {
				arr[i]=new general();
			}
			System.out.println(arr[i].notice());
		}
	}
}

