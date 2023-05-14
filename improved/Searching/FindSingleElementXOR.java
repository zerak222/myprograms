package com.programs;

public class FindSingleElementXOR {

	public static void main(String[] args) {
		
		int A[]= {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8};
		int singleElement=0;
		for(int i=0;i<A.length;i++) {
			singleElement = singleElement^A[i];
		}
		System.out.println(singleElement);
	}

}
