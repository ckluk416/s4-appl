package headfirst.designpatterns.factory.pizzafm;

public class CiwarugaStyleVeggiePizza extends Pizza {

	public CiwarugaStyleVeggiePizza() {
		name = "Ciwaruga Style Veggie Pizza";
		dough = "Healthy Whole Wheat Dough";
		sauce = "Peanut Sauce";
 
		toppings.add("Tofu");
		toppings.add("Tempeh");
		toppings.add("Bean Sprouts");
	}
}
