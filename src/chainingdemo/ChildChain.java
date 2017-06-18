package chainingdemo;

public class ChildChain extends ConstructorChaining{

	ChildChain() {
		//The Super keyword is calling the constructor of the parent class
		super(10,20);
		System.out.println("Now I am in child class calling super");
	}

}
