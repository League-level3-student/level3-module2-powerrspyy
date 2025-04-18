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
        for(int i = 0; i < eggs.size(); i++) {
        	if(eggs.get(i).equals("cracked")) {
        		return i;
        	}
        
        }
        return -1;
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

	public static int countPearls(List<Boolean> oysters) {
		int num = 0;
		
		for(Boolean o: oysters) {
			if(o) {
				num ++;
			}
		}
		return num;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double tallest = 0.0;
		for(Double p: peeps) {
			if (p > tallest) {
				tallest = p;
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		int size = 0;
		
		for(String word: words) {
			if(word.length() > size) {
				size = word.length();
				longest = word;
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message2) {
		// TODO Auto-generated method stub
		String message = "";
		for(String mes: message2) {
			message += mes;
		}
		if(message.contains("... --- ...")) {
			return true;
		}
		else {return false;}
	}

	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i < results.size(); i++) {
			for(int j = 0; j < results.size() - 1; j++) {
				if(results.get(j) > results.get(j + 1)) {
					Double temp;
					temp = results.get(j);
					results.set(j, results.get(j + 1));
					results.set(j + 1, temp);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsort) {
		
		for(int i = 0; i < unsort.size(); i++) {
			for(int j = 0; j < unsort.size() - 1; j ++) {
				if(unsort.get(j).length() > unsort.get(j + 1).length()) {
					String temp = unsort.get(j);
					unsort.set(j, unsort.get(j + 1));
					unsort.set(j + 1, temp);
				}
			}
		}
		return unsort;
	}

	public static List<String> sortWords(List<String> words) {
		for(int i = 0; i < words.size(); i++) {
			for(int j = 0; j < words.size() - 1; j++) {
				if(words.get(j).compareTo(words.get(j + 1)) > 0) {
					String temp = words.get(j);
					words.set(j,  words.get(j + 1));
					words.set(j + 1, temp);
				}
			}
		}
		return words;
	}
}
