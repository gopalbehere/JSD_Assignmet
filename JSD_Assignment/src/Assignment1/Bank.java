package Assignment1;


public class Bank {
	double amount;
	Bank(double amount){
		this.amount=amount;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(10000);
		System.out.println(b.checkBalance());
		b.deposite(5000);
		System.out.println(b.checkBalance());
		b.withdraw(5000);
		System.out.println(b.checkBalance());
		b.withdraw(50000);
		System.out.println(b.checkBalance());

		
	}
	
	public void deposite(double amt){
		amount+=amt;
		
	}
	
	public void withdraw(double amt){
		amount= (amount>=amt) ? amount-amt : amount; 
		if(amount<amt){
			System.out.println("Insufficient Balance");

		}
	}
	
	public double checkBalance(){
		return amount;
		
	}


}
