
public class MyClass {

	private static MyClass ref;
	
	private  MyClass(){
		
	}
	
	public static MyClass getObject() {
		if (ref==null) {
			ref=new MyClass();
			
		}
		return ref;
	}
}
