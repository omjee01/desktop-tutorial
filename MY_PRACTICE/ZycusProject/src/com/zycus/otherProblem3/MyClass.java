package com.zycus.otherProblem3;

class MyClass {

	int solve(int m, int n) {
	        m=m-2;
	        int y=n-2;
	        int [] f=new int[y];
	        f[0]=0;
	        f[1]=1;
	        int mod=7+(int)Math.pow(10,9);
	        for(int i=2;i<y;i++)
	            f[i]=(f[i-1]%mod+f[i-2]%mod)%mod;
	        int sum=0;
	        for(int i=m;i<y;i++)
	            sum=(sum%mod+f[i]%mod)%mod;
	        return sum;


	      }
	      
}
