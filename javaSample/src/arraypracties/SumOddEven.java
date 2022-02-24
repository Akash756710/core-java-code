package arraypracties;
import java.util.Scanner;
public class SumOddEven {

	public static void main(String[] args) {
		int sumE=0,sumO=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the element of array :");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0) {
				sumE=sumE +a[i];
			}
			else {
				sumO=sumO +a[i];
			}
		}
		System.out.println("sum of even number;" +sumE);
		System.out.println("sum of odd number:" + sumO);

	}

}
