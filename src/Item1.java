
/**
 * to afford an object for its client ,a class should use static factory method ,
 *  rather than just with constructor
 *  because there is a lot of advantages :
 *  ==> when a class require a lot of constructor , it is better to write static factory method
 *  	instead a lot of constructor which sometimes differ just in the signature
 *  ===> it avoid creating duplicate object ( the class is instance-controlled)
 *  
 *  rules for naming static factories method : 
 *  of : return the object with a given set of values
 *  from : return the object after a type conversion
 *  
 */
public class Item1 {

	private String fullName;
		
	public Item1(String fullName) {
		this.fullName = fullName;
	}
	
	public static Item1 fromFirstAndLast(String firstName, String lastName) {
		return new Item1(firstName +" "+lastName);
	}
	
}
