import java.util.Scanner;

public class BubbleSort {

	public static void bubblesort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<(arr.length-i-1);j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int i =0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		int [] a = new int[n];
		System.out.println("Enter the no. :" );
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		bubblesort(a);
		printArray(a);
	}

}
