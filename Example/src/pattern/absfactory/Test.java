package pattern.absfactory;

public class Test {
	
	public static void main(String[] args) {
		
		Kitchen abs=new AbstractKitchen();
		abs.getFood().food();
	}

}
