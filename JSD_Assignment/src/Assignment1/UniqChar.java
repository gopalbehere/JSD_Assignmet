package Assignment1;

public class UniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqChar("helloooeeygvvvgg");

	}
	
	public static void uniqChar(String str){
		
		String res="";
		
		for (int i=0;i<str.length();i++){
			if (!res.contains(Character.toString(str.charAt(i)))){
				res+=str.charAt(i);

				
			}
			
		}
		
		System.out.println(res);
		
		
	}

}
