package pizza.child;

import pizza.parent.Pizza;

public class EggPizza extends Pizza {

	
	public EggPizza(int price, String storeName) {
		//부모의 필드가 proctected여서 super안써도 된다.
		this.price = price;
		this.storeName = storeName;
	}
	
	
	@Override
	public void topping() {
		System.out.println("Egg Topping Pizza...");
		
	}
	
	

}
