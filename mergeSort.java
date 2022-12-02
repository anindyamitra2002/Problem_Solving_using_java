public class mergeSort {
    public static void merge(int []arr,int low,int high, int mid){
        int i = low;
        int j = mid+1;
        int [] aux = new int[arr.length];
        int k = low;
        while(i <= mid && j <= high){
            if (arr[i] < arr[j]){
              aux[k] = arr[i];
              i=i+1;
            }
            else {
              aux[k] = arr[j];
              j=j+1;
            }
            k=k+1;
        }
        while(i<=mid){
            aux[k] = arr[i];
            i=i+1;
            k=k+1;
        }
        while(j<=high){
            aux[k] = arr[j];
            j=j+1;
            k=k+1;
        }
        for(i=low; i<= high; i++){
            arr[i] = aux[i];
        }
    }

    public static void MergeSort(int [] arr1,int low,int high){
        if(low < high){
            int mid = (low + high)/2;
            MergeSort(arr1, low, mid);
            MergeSort(arr1,mid+1,high);
            merge(arr1, low, high, mid);
        }

    }
    public static void main(String[] args) {
        int [] x = {2,4,1,3,7,4,9,6};
        int h = x.length -1;
        System.out.print("Unsorted Array: ");
        for(int i=0; i< x.length; i++){
            System.out.print(x[i] + " ");
        }
        MergeSort(x,0, h);
        System.out.print("\nsorted Array: ");
        for(int i=0; i< x.length; i++){
            System.out.print(x[i] + " ");
        }
    }
}
