/*  Name		 : Yash Kumar Singh
    Roll Number  : 1310110373
    Major		 : Computer Science and Engineering
    Program Title: Print prime numbers till 1000 GL1 
*/

public class prime {
	
	static int checkPrime(int n){
		int i,flag=1;
		for(i=2;i<n;i++){
			if(n%i==0){
				flag=0;
				break;
			}
		}
		if(flag==0)
			return 0;
		else 
			return 1;
	}

	public static void main(String[] args) {
		int d,i,count=0;
		for(i=2;i<=1000;i++){
			d = checkPrime(i);
			if(d==1){
				System.out.print(i+" ");
				count++;
			}
			if(count==8){
				System.out.print("\n");
				count=0;
			}
		}
	}

}

