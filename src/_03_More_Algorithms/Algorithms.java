package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + num1 * num2;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
    
    public static boolean isPrime(int num) {
    	
    	for(int i = 2; i <= num/2; i++ ) {
    		if(num % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static boolean isSquare(int num) {
    	if(num == 1) {
    		return true;
    	}
    	
    	int mid = 0;
    	int left = 0;
    	int right = num/2;
    	
    	while(left < right) {
    		mid = (left + right) / 2;
    		int mid_sq = mid * mid;
    		
    		if(mid_sq == num) {
    			return true;
    		}
    		else if(mid_sq < num) {
    			left = mid + 1;
    		}
    		else {
    			right = mid - 1;
    		}
    	}
    	if (left * left == num) {
    		return true;
    	}
    	
		return false;
    	
    }
    
    public static boolean isCube(int num) {
    	
    	if(num == 1) {
    		return true;
    	}
    	
    	int mid = 0;
    	int left = 0;
    	int right = num/4;
		
    	while(left < right) {
    		mid = (left + right) / 2;
    		int mid_cb = mid * mid * mid;
    		
    		if (mid_cb == num) {
    			return true;
    		}
    		else if(mid_cb < num) {
    			left = mid + 1;
    		}
    		else {
    			right = mid - 1;
    		}
    	}
    	
    	if(left * left * left == num) {
    		return true;
    	}
    	
    	
    	
    	return false;
    	
    }
}
