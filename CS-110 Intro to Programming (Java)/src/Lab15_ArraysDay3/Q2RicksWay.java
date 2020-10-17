package Lab15_ArraysDay3;

public class Q2RicksWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {2,4,6,8,10};
		int number = 21;
		
		print(array1);
		print(addNum(number, array1));
		//print(array1);
	}
	
	public static void print (int [] arr) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int [] addNum (int num, int [] arr) {
		int [] newArr = new int [arr.length];
		for (int i = 0; i< arr.length; i++) {
			//arr[i] += 5;
			newArr[i] = arr[i];
			newArr[i] += num;
		}
		return newArr;
	}

}
