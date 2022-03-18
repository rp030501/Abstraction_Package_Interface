
public class MathOperation {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException {
		// TODO Auto-generated method stub
		if(args.length==5) {
			try {
				int arr[]=new int[5];
				double avg;
				int sum=0;
				for(int i=0;i<5;i++) {
					arr[i]=Integer.parseInt(args[i]);
				}
				for(int i=0;i<5;i++) {
					sum+=arr[i];
				}
				avg=sum/5;
				System.out.println("Sum = "+sum);
				System.out.println("Avg = "+avg);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("Please! Enter 5 elements");
		}
	}
}
