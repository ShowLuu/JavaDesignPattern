package pattern.factory;

public class Test {
	
	public static void main(String[] args) {
		
		Factory f=new Factory();
//		Human human=f.op("man");
//		human.speak();
		
		Human human=Factory.Womans();
		human.speak();
		
	}

}
