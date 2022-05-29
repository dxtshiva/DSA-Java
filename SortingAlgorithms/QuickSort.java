package SortingAlgorithms;
import java.util.Scanner;

public class QuickSort{
	
	int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = (low-1); 
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}

	void quicksort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi-1);
			quicksort(arr, pi+1, high);
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

		QuickSort ob = new QuickSort();
		ob.quicksort(arr, 0, arr.length - 1);

		System.out.print("Sorted array is: ");
		for(int i=0;i<8;i++)
            System.out.print(arr[i]+" ");

		sc.close();
	}
}