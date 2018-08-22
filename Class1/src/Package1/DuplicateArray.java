package Package1;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {5,26,34,6,8,5,34,21,12,8,};
		for (int i=0; i<array.length-1;i++) {
			for (int j=i+1;j<array.length;j++) {
				if ((array[i]==array[j]) ){
					System.out.println("Duplicate array elements ::"+array[j]);
				}
			}
		}

	}

}
