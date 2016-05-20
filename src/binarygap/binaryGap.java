package binarygap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.ArrayList;

public class binaryGap {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer:");
		int i = 0;
		try {
			 i = Integer.parseInt(br.readLine());
		}catch (NumberFormatException nfe) {
			System.err.println("invalid format");
		}
		System.out.print("Binary gap of given integer is:");
		System.out.print(solution(i));
	}
	
	public static int solution(int N) {
		int count = 0;
		ArrayList<Integer> gap = new ArrayList<Integer>();
		
	//	if (N >= 1 && N <= Integer.MAX_VALUE) {
			String binaryString = Integer.toBinaryString(N);
			System.out.println(binaryString);
			for (int i=0; i<(binaryString.length()-1);i++) {
				
				if ((Character.getNumericValue(binaryString.charAt(i)) == 1) && 
						(Character.getNumericValue(binaryString.charAt(i+1)) == 0)) {
					
					count++;
					
				}
				else if ((Character.getNumericValue(binaryString.charAt(i)) == 0) && 
						(Character.getNumericValue(binaryString.charAt(i+1)) == 0)) {
					
					count++;
		
				}
				else if ((Character.getNumericValue(binaryString.charAt(i)) == 0) && 
						(Character.getNumericValue(binaryString.charAt(i+1)) == 1)) {
					
					gap.add(count);
					
					count = 0;
				}
					
						
			}
			
			int biggestGap = 0;
			if (!gap.isEmpty())
				biggestGap = Collections.max(gap);
			//System.out.print(biggestGap);
			return biggestGap;
	//	}
		
		
	}

}
