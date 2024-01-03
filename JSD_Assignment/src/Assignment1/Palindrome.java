package Assignment1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome("madam");

	}
	
	public static void isPalindrome(String str){
		String res="";
		for(int i= (str.length()-1); i>=0; i-- ){
			res+=str.charAt(i);
			
		}
		if (res==str){
			System.out.println(str +" is a palindrome string");
			
		}else{
			System.out.println(str +" is NOT a palindrome string");

		}
		
		
	}

}
