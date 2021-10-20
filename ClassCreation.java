package week1.day1;

public class ClassCreation {
	// variable / state
	// instance variable that are not in the class,are used by the object of a class
	// class can be accessed all throught the classes globally using the  objects(instance)

	String ojectCategory = "mobile";
	float Siz;
	String Shape;
	String IMEI;
	String brandName;
	int resolution;
	short weight;

	// methods/Behaviour

	public void makecalls() {
		System.out.println("making calls");
	}

	public void viewGallery() {
		System.out.println("view the Gallery");
	}

	// To make use of the members of class
	// step1.main() method
	// step2.Create an object / Instantiating
	// memory is allocated only when object is created
	// memory allocated is not done when a class is created

	public static void main(String[] args) {

		// <className> <objectName> =new ClassName();
		// Members of a class can be accesses only through objects

		ClassCreation apple = new ClassCreation(); // apple is a object
		apple.brandName = "samsung";
		apple.Shape = "rectangle";
		System.out.println("apple brand" + apple.brandName);
		System.out.println("apple Shape" + apple.Shape);
	

		ClassCreation pen = new ClassCreation(); // pen is a object
		pen.brandName = "renolds";
		System.out.println("pen brand" + pen.brandName);

		ClassCreation pencil = new ClassCreation(); // pencil is a object
		pencil.Siz = 2.4f;
		System.out.println("pencil Siz" + pencil.Siz);
		
		
	}

}
