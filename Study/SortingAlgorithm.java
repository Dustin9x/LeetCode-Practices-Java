package Study;

public class SortingAlgorithm {

    public static void printArray(int no, int[] a){
        System.out.printf("%d: ",no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
    public static void bubbleSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]){
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            printArray(i,a);
            if(isSorted){
                break;
            }
        }
    }


    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            printArray(i,arr);
        }
    }
    
    public  static  void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            //tim index cua phan tu min sau a[i]
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            //neu tim thay thi swap
            if(minIndex != i){
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(i , a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
//        bubbleSort(a);
        insertionSort(a);
//        selectionSort(a);
    }
}
