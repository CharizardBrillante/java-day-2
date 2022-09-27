
public class PhoneCall {
	
	String phoneNum;
	String callDuration;
	
	PhoneCall(String phoneNum, int seconds){
		this.phoneNum = phoneNum;
		this.callDuration = calcDuration(seconds);
	}
	
	String calcDuration(int sec) {
		int min = sec / 60;
		int s = sec - 60 * min;
		
		return min + ":" + s + " minutes";
	}
}
