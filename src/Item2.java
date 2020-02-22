
/**
 * this item is so important when dealing with a class that has a lot of attributes ( some required, some are optionals)
 * the client of our code find himself sometimes obliged to afford default values for other parameter
 * or sometimes , there is a pattern that developer use : they create constructor with required
 * parameters and then use setter ==> this is not good : constructor can have different parameter
 * with the same type , and by mistake , the client can inverse the order
 * 
 * The solution is to use a builder , let's see an example
 */
/**
 * this class describe nutrition aliments
 */
public class Item2 {

	private int servingSize ; // required
	
	private int servings; // required
	
	private int calories; // optional
	
	private int fat; // optional
	
	private int sodium; // optional
	
	private int carbohydrate; // optional
	
	public static class Builder {
		
		// required parameters
		
		private int servingSize ; 
		
		private int servings; 
		
		// optional parameters - initialized to their default values
		
		private int calories = 0; 
		
		private int fat = 0; 
		
		private int sodium = 0; 
		
		private int carbohydrate; 
		
		public Builder(int servingSize,int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val){
			calories = val;
			return this;
		}
		
		public Builder fat(int val){
			fat = val;
			return this;
		}
		
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		
		public Item2 build(){
			return new Item2(this);
		}
	}
	
	private Item2(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	public static void main(String[] args) {
		// the client will lok like this
		Item2 item2 = new Item2.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
	}
}
