/**
 * 
 * We don't have to write equals method if :
 *  >>Each object of a class is (by definition) unique like Thread
 *	>> No need for logical testing of object equality
 *	>> The superclass has already overriden equals and the subclass isOK with this behavior
 *	>> The class is package private and we are certain that the equal will 
 *		never be called
 */
public class Item10 {
	
	// the overriden equals method must adhere to this contract :
	/*
	 * Reflexive : for all x not null => x.equals(x) must return true
	 * Symmetric : x.equals(y) return true if and only if y.equals(x) return true
	 * Transitive : if x.equals(y) is true and y.equals(z) is true then x.equals(z) must be true
	 * Consistent : x.equals(y) return true , then x.equals(y) must return true if x and y are not changed
	 * (x is not null) x.equals(null) must return always false
	 */
	public static void main(String[] args) {
		
		// example for the non respect of reflexive rule and interoperability : 	
		A a = new A("Polish");
		String s = "Polish";
		System.out.println(a.equals(s));
		System.out.println(s.equals(a));
	}
	
	
}
class A {
	
	String s;
	
	A(String s){
		this.s = s;
	}
	public boolean equals(Object o) {
		if(o instanceof A)
			return s.equalsIgnoreCase(((A) o).s);
		if(o instanceof String)
			return s.equalsIgnoreCase((String)o);
		return false;
	}
}

