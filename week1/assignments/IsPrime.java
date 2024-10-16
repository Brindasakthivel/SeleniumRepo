package week1.assignments;

public class IsPrime {

	public static void main(String[] args) {
        int n=12;
        int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count=1;
				break;
			}}
		    if(count==0) {
			System.out.println("is  prime number");	
		}
			else{
				System.out.println("is not prime number");	
			}
	}}
	

