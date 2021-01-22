package com.avinash.ch1.exercises;

/*R-1.1
	Suppose that we create an array A of GameEntry objects, which has an integer
	scores field, and we clone A and store the result in an array B. If we then
	immediately set A [4].score equal to 550, what is the score value of the
	GameEntry object referenced by B[4]? 
*/




public class R1_1_GameEntry {
	
	int scores;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R1_1_GameEntry [] A = new R1_1_GameEntry[6];
		for(int i = 0; i<6;i++){
			A[i] = new R1_1_GameEntry();
			A[i].scores = (i+1)*100;
		}
		System.out.print("AAAA score before Cloning:\t");
		for(int i = 0; i<6;i++){
			System.out.print("\t"+A[i].scores);
		}
		System.out.println();
		R1_1_GameEntry [] B = A.clone();
		System.out.print("BBBB score After Shallow Cloning:\t");
		for(int i = 0; i<6;i++){
			System.out.print("\t"+B[i].scores);
		}
		System.out.println();
		A[4].scores=550;
		System.out.println("Score at B[4]:\t"+B[4].scores);
		System.out.println("Score at A[4]:\t"+A[4].scores);
		for(int i=0; i<6;i++){
			//B[i] = A[i];
			B[i].scores = A[i].scores;
		}
		
		System.out.print("BBBB score After Deep Cloning:\t");
		for(int i = 0; i<6;i++){
			System.out.print("\t"+B[i].scores);
		}
		A[4].scores=999;
		System.out.println("Score at B[4] After Deep cloning:\t"+B[4].scores);
		System.out.println("Score at A[4] After Deep cloning:\t"+A[4].scores);
	}

}
