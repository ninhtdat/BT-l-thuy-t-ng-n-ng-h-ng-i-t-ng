import java.util.Scanner;
public class bai5_4 {
	private int n;
	public static void printTriagle(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		bai5_4 num = new bai5_4();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("n = ");
		int k = keyboard.nextInt();
		num.n = k;
		num.printTriagle(num.n);
	}
}