
public class bai5_6 {
	private int[] array = { 1789, 2035, 1899, 1456, 2013};
	public static void main(String[] args) {
		bai5_6 a = new bai5_6();
		//
		int temp = a.array[0];
        for (int i = 0 ; i < a.array.length-1; i++) {
            for (int j = i + 1; j < a.array.length; j++) {
                if (a.array[i] > a.array[j]) {
                    temp = a.array[j];
                    a.array[j] = a.array[i];
                    a.array[i] = temp;
                }
            }
        }
        for(int i=0; i< a.array.length; i++) {
        	System.out.print(a.array[i]+ " ");
        }
	}
}
