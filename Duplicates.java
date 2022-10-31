
public class Duplicates {

	public static int removeduplicates(int a[], int n)
	{
		if (n == 0 || n == 1) {
			return n;
		}

		
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		return j;
	}
	public static void main(String[] args)
	{
		int a[] = { 1, 1, 2, 2, 2,6,4,5,6,7,4,4,6,7,5,4,8,9};
	int n = a.length;

		n = removeduplicates(a, n);


		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
