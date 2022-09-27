import java.util.ArrayList;

public class Cart {
	Customer customer;
	ArrayList<Article> articles = new ArrayList<Article>();
	double totPrice;
	
	Cart(Customer customer){
		this.customer = customer;
	}
	
	double calcTotPrice(){
		double total = 0;
		for (int i = 0; i < this.articles.size(); i++) {
			total += articles.get(i).price;
		}
		return total;
	}
	
	void addToCart(Article art) {
		if (art.stock > 0) {
			this.articles.add(art);
			art.stock--;		
		} else {
			System.out.println("Warning! Article out of stock!");
		}
	}
}
