package Assignment1;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr= new int[10];
		int[] arr={1,4,2,5,7,8,9,3,7,5};
        int[] subarray = Arrays.copyOfRange(arr, 2, 7);
        
        int fMax=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        
        for (int num: subarray){
        	
        	if (num>fMax){
        		sMax=fMax;
        		fMax=num;	
        	}else if(num>sMax && num!=fMax){
        		sMax=num;
        		
        	}
        }
        System.out.print("The second Largest Number is: "+ sMax);
        

		

	}

}
