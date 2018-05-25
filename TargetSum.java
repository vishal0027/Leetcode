package google;

import java.util.HashSet;

public class TargetSum {
	public static boolean TargetExist(int[] input, int target){
		int len = input.length-1;int i=0; 
		while(i!=len){
			if((input[i] + input[len]) == target){
				return true;
			}else if ((input[i] + input[len]) > target){
				len--;
			}else if((input[i] + input[len]) < target){
				i++;
			}
		}
		return false;
	}
	public static boolean UnsortedTargetExist(int[] input, int target){
		int len = input.length-1;int i=0;HashSet<Integer> compliment = new HashSet<Integer>();
		for(i=0; i<=len; i++){
			if(compliment.contains(input[i])){
				return true;
			}else{
				compliment.add(target-input[i]);
			}
		}
		return false;
	}
	// Tester
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,10,0,4,4,8};
		System.out.println(UnsortedTargetExist(a,17));
	}
}
