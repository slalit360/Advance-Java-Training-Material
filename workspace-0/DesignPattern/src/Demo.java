
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass a=MyClass.getObject();
		System.out.println(a.hashCode());
		
		MyClass b=MyClass.getObject();
		System.out.println(b.hashCode());
	}

}
