package SortingAlgorithms;
import java.util.Scanner;

public class MergeSort
{
	void merge(int arr[], int l, int m, int r)
	{
		int n1 = m - l + 1, n2 = r - m;

		int left[] = new int[n1];
		int right[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			left[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			right[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	void mergesort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			mergesort(arr, l, m);
			mergesort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}


    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your registration number: ");
        String ar = sc.next();

		int arr[] = new int[8];

        for(int i=0;i<8;i++)
            arr[i]=Integer.parseInt(""+ar.charAt(i));

		System.out.print("Initial Array is: ");
		for(int i=0;i<8;i++)
            System.out.print(arr[i]+" ");

        System.out.println();

		MergeSort ob = new MergeSort();
		ob.mergesort(arr, 0, arr.length - 1);

		System.out.print("Sorted array is: ");
		for(int i=0;i<8;i++)
            System.out.print(arr[i]+" ");
			sc.close();
	}
}
