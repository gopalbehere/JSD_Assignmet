package Assignment1;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StrongNumber strongNumber = new StrongNumber(); 
        System.out.println(strongNumber.isStrong(14));
		

	}
	
	int facto(int n){
		int fact=1;
		while (n>1){
			
			fact*=n;
			n-=1;
		}
		return fact;
			
		
	}
	
	boolean isStrong(int num){
		int sum=0;
		int onum=num;
		int n;
		
		while(num>0){
			n=num%10;
			sum+=facto(n);
			num=num/10;
		}
		
		
		
		return onum==sum;
		
		
	}

}
