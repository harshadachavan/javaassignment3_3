package chainingdemo;

public class ChainingDemo {
	/*
	 * Constructor chaining can be done in two ways:
Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.

both are being demonstrated here
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Here when the child class object is called, it calls constructor of the child
		 * class, which in turn calls constructor of the parent class using the keyword Super
		 * 
		 * as the constructors in the parent class have already been chained using this()
		 * keyword all constructor of parent class get called
		 * */
		ChildChain cc = new ChildChain();


	}

}
