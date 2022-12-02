public class Next_permutation {
    public static void reverse(int [] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
   public static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int [] nums = {7,4,5,3,2,1};
        int i, key, j;
        int end = nums.length-1;
        for(i=nums.length-1; i>=0;i--){
            if(nums[i-1] < nums[i]){
                key = nums[i-1];
                for(j=nums.length-1; j>=i;j--){
                    if(nums[j] > key){
                        swap(nums, j,(i-1));
                        reverse(nums, i, end);
                        break;
                    }
                }
                break;
            }
        }
        for(i=0; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }
//
    }

}
