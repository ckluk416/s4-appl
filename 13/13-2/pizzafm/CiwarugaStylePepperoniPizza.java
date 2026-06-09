package headfirst.designpatterns.factory.pizzafm;

public class CiwarugaStylePepperoniPizza extends Pizza {

	public CiwarugaStylePepperoniPizza() {
		name = "Ciwaruga Style Pepperoni Pizza";
		dough = "Thick Crust Dough";
		sauce = "Sweet and Spicy Sauce";
 
		toppings.add("Beef Pepperoni");
		toppings.add("Fried Shallots");
	}
}
