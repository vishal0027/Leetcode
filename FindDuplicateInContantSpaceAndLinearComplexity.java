public class FindDuplicateInContantSpaceAndLinearComplexity{
	public FindDuplicateInContantSpaceAndLinearComplexity(){}
	public FindDuplicateInContantSpaceAndLinearComplexity(int input[]){
		findIt(input);
	}
	public void findIt(int input[]){ 
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < input.length; i++){
		    if (input[Math.abs(input[i])] >= 0) input[Math.abs(input[i])] = -input[Math.abs(input[i])];
		    else System.out.print(Math.abs(input[i]) + " ");
		} 
	}
}
