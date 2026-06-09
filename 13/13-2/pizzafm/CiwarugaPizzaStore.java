package headfirst.designpatterns.factory.pizzafm;

public class CiwarugaPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new CiwarugaStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new CiwarugaStyleVeggiePizza();
		} else if (item.equals("pepperoni")) {
			return new CiwarugaStylePepperoniPizza();
		} else return null;
	}
}
