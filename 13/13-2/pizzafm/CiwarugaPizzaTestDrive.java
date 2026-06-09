package headfirst.designpatterns.factory.pizzafm;

public class CiwarugaPizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore ciwarugaStore = new CiwarugaPizzaStore();
 
		Pizza pizza = ciwarugaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
 
		pizza = ciwarugaStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = ciwarugaStore.orderPizza("pepperoni");
		System.out.println("Maria ordered a " + pizza.getName() + "\n");
	}
}
