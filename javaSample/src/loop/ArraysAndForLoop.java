package loop;
 import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
class ArraysAndForLoop {

	public static void main(String[] args) {
		float[] marks=new float[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Value");
		for(int i=0;i<marks.length;i++) {
		 marks[i]=sc.nextFloat();
		}
		
		System.out.println("values of array......");
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		Arrays.sort(marks);

	}

}
