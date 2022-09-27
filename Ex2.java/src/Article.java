
public class Article {
	int code;
	String desc;
	double price;
	int stock;
	static int internalCode = 0;
	
	Article(String desc, double price, int stock){
		code = this.internalCode++;
		this.desc = desc;
		this.price = price;
		this.stock = stock;
	}
	
}

