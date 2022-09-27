
public class Exercise2 {


	public static void main(String[] args) {
		
		//---------------------------------------------EXERCISE 1-------------------------------------------------
		
		System.out.println("-------RECTANGLE EXERCISE-------\n");
		Rectangle rect1 = new Rectangle(10, 15);
		Rectangle rect2 = new Rectangle(8, 18);
		rect1.printRect();
		rect2.printRect();
		Rectangle.compareRect(rect1, rect2);
		
		//---------------------------------------------EXERCISE 2------------------------------------------------
		System.out.println("\n-------SIM EXERCISE-------\n");
		SimCard sim1 = new SimCard("3331234567", 0);
		
		sim1.callAction(new PhoneCall("3339876543", 76));
		
		sim1.recharge(5);
		
		sim1.callAction(new PhoneCall("3339834343", 112));
		sim1.callAction(new PhoneCall("3339854213", 186));
		sim1.callAction(new PhoneCall("3339517813", 42));
		sim1.callAction(new PhoneCall("3339854184", 73));
		sim1.callAction(new PhoneCall("3389300216", 145));

		
		sim1.printSimData();
		
		//----------------------------------------------EXERCISE 3---------------------------------------------------
		System.out.println("\n-------SHOP EXERCISE-------\n");
		
		//Customers
		Customer customer1 = new Customer("Mario Draghi", "m.draghi@gmail.com");
		Customer customer2 = new Customer("Dario Magri", "d.magri@gmail.com");
		
		System.out.println("Customer 1 name: " + customer1.fullName + " " +
						"Customer 1 code: " + customer1.code + " " +
						"Customer 1 date: " + customer1.joinedAt
						);
		System.out.println("Customer 2 name: " + customer2.fullName + " " +
				"Customer 2 code: " + customer2.code + " " +
				"Customer 2 date: " + customer2.joinedAt
				);
		
		//Articles
		Article art1 = new Article("articolo 1", 19.99, 50);
		Article art2 = new Article("articolo 2", 29.99, 50);
		Article art3 = new Article("articolo 3", 39.99, 50);
		Article art4 = new Article("articolo 4", 49.99, 50);
		Article art5 = new Article("articolo 5", 59.99, 50);
		
		//Carts
		Cart cart1 = new Cart(customer1);
		Cart cart2 = new Cart(customer2);
		
		cart1.addToCart(art5);
		cart1.addToCart(art2);
		cart1.addToCart(art4);
		
		cart2.addToCart(art1);
		cart2.addToCart(art3);
		cart2.addToCart(art4);
		
		System.out.println("total price of articles in cart1 is: " + cart1.calcTotPrice() + "€");
		System.out.println("total price of articles in cart2 is: " + cart2.calcTotPrice() + "€");
		System.out.println("Stock: art1: " + art1.stock + "; art2: " + art2.stock + 
				"; art3: " + art3.stock + "; art4: "+ art4.stock + "; art5: "+ art1.stock);
		
	}

}


