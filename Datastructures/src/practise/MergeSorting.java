package practise;

public class MergeSorting {

	
	static void merge(int arr[],int l,int m,int r){
		
		int n1 = m-l+1;
		int n2 = r -m;
		
		int[] larr=new int[n1];
		int[] rarr=new int[n2];
		
		for(int i=0;i<n1;i++)larr[i] =arr[l+i];
		for(int j=0;j<n2;j++)rarr[j] =arr[m+1+j];
		
		int i=0;int j=0;
		int k=l;
		while(i < n1 && j < n2){
			if(larr[i] < rarr[j]){
				arr[k] = larr[i];
				i++;
			}else{
				arr[k]=rarr[j];
				j++;
			}
			k++;
		}
		
		while(i < n1){
			arr[k] = larr[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = rarr[j];
			j++;
			k++;
		}
	}
	
	//l -m
	//m+ r
	static void sort(int[] arr,int l,int r){
		if(l < r){
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr, l, m, r);
		}
	}
	
	static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	public static void main(String[] args) {
		
		int arr[]={1,2,4,3};
		sort(arr,0,arr.length-1);
		printArray(arr);
	}
}
