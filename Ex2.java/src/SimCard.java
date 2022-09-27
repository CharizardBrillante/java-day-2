import java.util.ArrayList;

public class SimCard {
	
	String phoneNum;
	double credit;
	ArrayList<PhoneCall> lastCalls = new ArrayList<PhoneCall>();
	
	SimCard(String phoneNum, double credit){
		this.phoneNum = phoneNum;
		this.credit = credit;
	}
	
	void recharge(double amount) {
		this.credit += amount;
	}
	
	void callAction(PhoneCall call) {
		if (this.credit > 0) {
			this.lastCalls.add(call);
		}else {
			System.out.println("Warning! Credit not sufficient to call!");
		}
	}
	
	void printSimData() {
		System.out.println("Phone number of this SIM is: " + this.phoneNum);
		System.out.println("Credit of this SIM is: " + this.credit);
		System.out.println("Last five calls are: ");
		for(PhoneCall call : this.lastCalls) {
			System.out.println("to " + call.phoneNum);
			System.out.println("for " + call.callDuration);
		}
	}
}

