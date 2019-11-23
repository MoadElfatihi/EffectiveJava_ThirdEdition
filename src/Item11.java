import java.util.Objects;

/**
 * 
 * we must overide hashcode method when we overrid equals method
 * HashCode are very useful when we work with HashMap
 *
 */
public class Item11 {
	
	private String name;
	
	private Integer age;
	
	public boolean equals(Object i) {
		if( i == this)
			return true;
		if( !(i instanceof Item11))
			return false;
		
		Item11 item = (Item11) i;
		return item.name.equals(this.name) && item.age.intValue() == this.age.intValue();
	}
	
	public int hashCode() {
		return Objects.hash(name,age);
	}

}
