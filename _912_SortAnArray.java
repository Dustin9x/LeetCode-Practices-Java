import java.util.Arrays;

public class _912_SortAnArray {
    public int[] sortArray(int[] nums) {

        mergeSort(nums,0,nums.length-1);

        return nums;
    }

    public void mergeSort(int[] arr, int left, int right){
        if (left >= right) return;

        //Chia ra
        System.out.println("Chia: " + left + " - " + right);
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr, mid+1,right);


        //Tron vao
        merge(arr,left,mid,right);
    }

    public void merge(int[] nums, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int idx1 = left;
        int idx2 = mid+1;
        for (int i=0; i< temp.length; i++) {
            if (idx1>mid)  {
                temp[i] = nums[idx2++];
                continue;
            }
            if (idx2>right)  {
                temp[i] = nums[idx1++];
                continue;
            }
            if (nums[idx1] < nums[idx2]) {
                temp[i] = nums[idx1];
                idx1++;
            } else {
                temp[i] = nums[idx2];
                idx2++;
            }
        }

        for (int i=0; i< temp.length; i++) {
            nums[left+i] = temp[i];
        }
    }

    public static void main(String[] args) {
        _912_SortAnArray s = new _912_SortAnArray();
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {5,1,1,2,0,0};
    }
}


