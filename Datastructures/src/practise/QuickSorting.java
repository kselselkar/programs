package practise;

public class QuickSorting {

	
	static int partition(int arr[],int low,int high){
		int i = low - 1;
		int pivot = arr[high];
		for(int j=low;j<high-1;j++){
			if(arr[j] < pivot){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	static void sort(int[] arr,int low,int high){
		
		int partition = partition(arr,low,high);
		sort(arr,low,partition-1);
		sort(arr,partition+1,high);
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	public static void main(String args[]){
		
		int arr[] = {10, 7, 8, 9, 1, 5};
		sort(arr,0,arr.length-1);
		printArray(arr);
	}
	
}
