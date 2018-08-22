package Package1;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j =0;
		int array [] = {12,34,45,56,12,34,88,98,37,88};
		for (int i = 0; i < array.length-1;i++) {
			if (array[i]!=array[i+1]) {
				
				array[j]=array[i];
				j++;
			}
		}
				//array[j]= array[j-1];
				System.out.println(array[j]);
		
	}

}
