package pattern.absfactory;

public class AbstractKitchen implements Kitchen {

	@Override
	public Food getFood() {
		return new Apple();
	}

	@Override
	public TableTool getTableTool() {
		return new Knife();
	}

}
