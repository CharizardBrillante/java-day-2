import java.text.DateFormat;
import java.util.Calendar;

public class Customer {
	String fullName;
	String email;
	String joinedAt;
	int code;
	static int internalCode = 0;
	
	Customer(String fullName, String email){
		this.fullName = fullName;
		this.email = email;
		this.code = this.internalCode++;
		this.joinedAt = this.getDate();
	}
	
	String getDate() {
		DateFormat date = DateFormat.getDateInstance();
		Calendar cal = Calendar.getInstance();
		
		return date.format(cal.getTime());
	}
}