package pattern.factory;

public class Factory {

	public Human op(String type){
		if(type.equals("man")){
			return new Man();
		}else if(type.equals("woman")){
			return new Woman();
		}else{
			return null;
		}
	}
	
	public Human man(){
		return new Man();
	}
	
	public Human Woman(){
		return new Woman();
	}
	
	public static Human mans(){
		return new Man();
	}
	
	public static Human Womans(){
		return new Woman();
	}
	
}
