package chainingdemo;

public class ConstructorChaining {
	/*
	 * This process is used when we want to perform multiple tasks in a 
	 * single constructor rather than creating a code for 
	 * each task in a single constructor we create
	 *  a separate constructor for each task and make their 
	 *  chain which makes the program more readable.
	 * 
	 * */
	//The default constructor
	public ConstructorChaining() {

		System.out.println("I am in Default Constructor");
	}

	//Constructor with one parameter
	public ConstructorChaining(int i) {
		this(); //calling default constructor
		System.out.println("I am in constructor 2 with one parameter i :"+i);

	}

	//Constructor with two parameters
	public ConstructorChaining(int i,int k) {
		this(i); //calling constructor with one parameter
		int sum = i+k;
		System.out.println("I am in constructor 3 with two parameter Sum of which is : "+sum);

	}
}
