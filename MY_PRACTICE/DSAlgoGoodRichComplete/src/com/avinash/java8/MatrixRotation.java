package com.avinash.java8;

public class MatrixRotation {
	
	/*		1  2  3
	 * 		4  5  6
	 *      7  8  9
	 *      
	 *       7 4  1
	 *       8 5  2
	 *       9 6  3
	 *       
	 *       
	 *       
	 *       j----->
	 *       i
	 */      
	
		int [][] getArrayRotated(int [][] input){
			
			for(int i=0; i<input.length; i++){
				for(int j=0; j<input[i].length;j++){
					input[i][j] = input[j][i];
				}
			}
			
			return input;
		}
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
