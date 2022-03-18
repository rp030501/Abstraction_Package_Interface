package Main;

import Test_Package.Foundation;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation f=new Foundation();
		//System.out.println(f.var1); not accessible
		//System.out.println(f.var2); not accessible
		//System.out.println(f.var3); not accessible
		System.out.println(f.var4); //accessible
	}
}
