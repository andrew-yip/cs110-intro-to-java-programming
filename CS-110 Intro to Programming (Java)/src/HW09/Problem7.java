package HW09;
public class Problem7 {

	public static void main(String[] args) {

	int[][] array = new int[10][10];
	print(fillArray(array));
	for (int x = 0; x < 10; x++)
		System.out.println("Person " + x + " has " + count(array, x) + " friends.");
	}

	public static int[][] fillArray(int[][] array) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				array[i][j] = (int) (Math.random() * 2);
			}
		}
		return array;
	}

	public static void print(int[][] array) {
		System.out.print("  ");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			for (int j = 0; j <= i; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int count(int[][] array, int x) {
		int count = 0;
		//counting horizontal
		for (int i = 0; i < x; i++) {
			if (array[x][i] == 1) {
				count += 1;
			}
		}
		//counting vertical (down)
		for (int j =x; j < array.length; j++) {
			if (array[j][x] == 1) {
				count += 1;
			}
		}

		return count;
	}
	} // counts friends
