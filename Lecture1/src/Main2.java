
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minValue = findMin(10,20,30,40,50);
		System.out.println(minValue);
	}
	
	private static int findMin (int...array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
