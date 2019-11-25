import java.util.Objects;

/*
 * Always overrid toString in all instantiable classes , it helps a lot for instance : debugging
 */
public class Item12 {

	private int age;
	
	private String name;

	public boolean equals(Object o) {
		if( o == this)
			return true;
		if( !(o instanceof Item11))
			return false;
		
		Item12 item = (Item12) o;
		return item.name.equals(this.name) && item.age== this.age;
	}
	
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	
	public String toString() {
		return "Item12 [age=" + age + ", name=" + name + "]";
	}
	
	
}
