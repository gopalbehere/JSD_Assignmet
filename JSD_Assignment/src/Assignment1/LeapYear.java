package Assignment1;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear lp=new LeapYear();
		System.out.println(lp.isLeap(400));
	}
	
	
	boolean isLeap(int year){
		if (year%4==0 && year%100!=0){
			return true;
		}else if(year%400==0){
			return true;
		}else{
			return false;
		}
	}

}
