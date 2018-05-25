package google;

public class RepeatedSubString {
	public static int RepeatedSubStringSol(String A, String B){
		int i = 1;StringBuilder S = new StringBuilder(A);
        for (; S.length() < B.length(); i++){
        	S.append(A);
        }
        if (S.indexOf(B) >= 0){
        	return i;
        }
        if (S.append(A).indexOf(B) >= 0){
        	return i+1;
        }
        return -1;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RepeatedSubStringSol("abcd","cdabcd"));
	}
}
