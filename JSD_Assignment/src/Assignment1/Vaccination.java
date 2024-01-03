package Assignment1;

public class Vaccination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vaccine vc=new VaccineSuccssed(20,"indian");
		vc.firstDose();
		vc.secondDose();
		vc.boosterDose();
		

	}

}

abstract class Vaccine{
	int age;
	String nationality;
	boolean firstDose=false;
	boolean secondDose=false;

	Vaccine(int age, String nationality){
		this.age=age;
		this.nationality=nationality;
		
	}
	
	void firstDose(){
		if (age>=18 && nationality=="indian"){
			System.out.println("250rs Paid");

			System.out.println("First Vaccination successful");
			firstDose=true;
			
		}
		else{
			System.out.println("You are not eligible");

		}
	}
	
	void secondDose(){
		
		if(firstDose){
			
			System.out.println("Second Vaccination successful");
			secondDose=true;

		}else{
			System.out.println("Take firstDose first");

		}
		
	}
	
	abstract void boosterDose();
	
}

class VaccineSuccssed extends Vaccine{

	VaccineSuccssed(int age, String nationality) {
		super(age, nationality);
		// TODO Auto-generated constructor stub
	}

	@Override
	void boosterDose() {
		System.out.println("Booster Dose Successful");

		
	}
	
}
