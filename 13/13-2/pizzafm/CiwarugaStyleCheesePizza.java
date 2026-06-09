package headfirst.designpatterns.factory.pizzafm;

public class CiwarugaStyleCheesePizza extends Pizza {

	public CiwarugaStyleCheesePizza() { 
		name = "Ciwaruga Style Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Sambal Matah Sauce";
 
		toppings.add("Grated Cheddar Cheese");
		toppings.add("Green Chilies");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into 6 triangular slices");
	}
}
