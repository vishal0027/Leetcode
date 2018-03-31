public class Solution{
	public boolean isPalindrome(int x){
		if(x<0)return false;if(x/1<10)return true;int divisor=1;
		while(x/divisor>=10)divisor*=10;
		while(x!=0){
			int mostSigni=x/divisor;
			int leastSigni=x%10;
			if(mostSigni!=leastSigni) return false;
			x=(x%divisor)/10;
			divisor=divisor/100;
		}
		return true;
	}
}