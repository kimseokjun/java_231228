package parentPackage;

public class ParentClass {
	public String protectedField;
	
	public ParentClass() {
		this.protectedField = "Public Field";
		
	}
	
	
	public void  protectedMethod() {
		System.out.println("This is a public method");
	}
}
