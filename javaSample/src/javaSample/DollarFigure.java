package javaSample;

public class DollarFigure {

	public static void main(String[] args) {
		int n=0;
		int m=0;
		
		for(int i=0;i<=7;i++) {
			for(int l=0;l<n;l++) {
				System.out.println('*');
			}
			for(int j=0;j<7-m;j++) {
				System.out.println('$');
			}
			for(int k=0;k<14-n;k++) {
				System.out.println('*');
			}
			for(int j=0;j<7-m;j++) {
				System.out.println('$');
			}
			for(int l=0;l<n;l++) {
				System.out.println('*');
			}
			System.out.println();
			m+=1;
			n+=2;
		/*for(int i=1;i<=7; i++) {
			for(int j=0;j<2*i-2;j++)
				System.out.println("*");
			for(int j=0;j<-i+8;j++)
				System.out.println("$");
			for(int j=0;j<-2*i+16;j++)
				System.out.println("*");
			for(int j=0;j<-i+8;j++)
				System.out.println("$");
			for(int j=0;j<2*i-2;j++)
				System.out.println("*");
			System.out.println();*/
		}

	}

}
