package Assignment1;

public class HillStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HillStation hs= new HillStation();
		hs.forFamous();
		hs.location();

		HillStation mhs= new Manali();
			mhs.forFamous();
			mhs.location();
			
		HillStation ghs= new Goolmerg();
			ghs.forFamous();
			ghs.location();
			
		HillStation mshs= new Musoorie();
			mshs.forFamous();
			mshs.location();
			
	}
	
	public void location(){
		System.out.println("HillStation");
	}
	
	public void forFamous(){
		System.out.println("HillStation");

	}

}

class Manali extends HillStation{
	public void location(){
		System.out.println("Manali(Uttarakhand)");
	}
	
	public void forFamous(){
		System.out.println("Manali is famous for snowfall");

	}
}

class Musoorie extends HillStation{
	public void location(){
		System.out.println("Masoorei(Uttarakhand)");
	}
	
	public void forFamous(){
		System.out.println("Masoorei is famous for greenary");

	}
	
}

class Goolmerg extends HillStation{
	public void location(){
		System.out.println("Goolmarg(Jammuand  kashmir)");
	}
	
	public void forFamous(){
		System.out.println("Goolmarg is famous for heavy snowfall");

	}
	
}