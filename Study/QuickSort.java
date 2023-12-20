package Study;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] a, int L, int R){
        //Dieu kien dung
        if(L >= R) return;

        //B1: chon khoa
        int key = a[(L+R)/2];

        //B2: Phan bo lai mang theo khoa
        int k = partition(a, L, R, key); //k la index cua key
        System.out.println("L="+L+" R="+ R+" Key="+key+" k="+k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a,L,R+1)));

        //B3: Chia doi mang => lap lai
        quickSort(a, L, k-1);
        quickSort(a, k, R);
    }

    public static int partition(int[] a, int L, int R, int key){
        int iL = L;
        int iR = R;
        while(iL <= iR) {
            //Voi iL, di tim phan tu >= key de doi cho
            while(a[iL] < key) {
                iL++;
            }

            //Voi iR, di tim phan tu > key de doi cho
            while(a[iR] > key) {
                iR--;
            }

            //Doi cho 2 phan tu dang khong dung vi tri
            if(iL <= iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = {6,7,8,5,4,1,2,3};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
