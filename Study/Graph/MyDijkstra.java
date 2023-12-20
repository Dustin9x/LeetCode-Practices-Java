package Study.Graph;

import java.util.HashSet;
import java.util.Set;

public class MyDijkstra {

    public static void main(String[] args) {
        int n = 5;
        int[][] a = {   {0,6,0,1,0},
                        {6,0,5,2,2},
                        {0,5,0,0,5},
                        {1,2,0,0,1},
                        {0,2,5,1,0} };
        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n]; //distance[i] = khoang canh tu xuat phat den i
        int[] previous = new int[n]; //previous[i] = la dinh ngay phia truoc i

        int start = 0; // diem xuat phat
        int finish = 2; // diem ket thuc
        int oo = Integer.MAX_VALUE;

        //Buoc 1: khoi tao khoang cach
        for (int i = 0; i < n; i++) {
            distance[i] = oo;
        }
        distance[start] = 0;

        while(visited.size() < n) {
            //Buoc 2: chon dinh chua duyet
            //va dang co khoang cach nho nhat tu dinh xuat phat lam dinh dang xet
            int dangXet = 0;
            int minDistance = oo;
            for (int i = 0; i < n; i++) {
                if (visited.contains(i) == false && distance[i] < minDistance){
                    minDistance = distance[i];
                    dangXet = i;
                }
            }

            //Buoc 3: Tu dinh dang xet, duyet cac dinh lien ke chua duyet
            //update khoang cach va dinh truoc cua cac dinh do
            for (int i = 0; i < n; i++) {
                if(visited.contains(i) == false && a[dangXet][i] !=0){
                    int newDistance = distance[dangXet] + a[dangXet][i];
                    if(newDistance < distance[i]){
                        distance[i] = newDistance;
                        previous[i] = dangXet;
                    }
                }
            }

            //Buoc 4: Danh dau dinh dang xet thanh dinh da duyet
            visited.add(dangXet);
        }
        System.out.println("Khoang cach nho nhat tu " + start + " den "+finish + " la: "+distance[finish]);
        System.out.println("Duong di la:");
        int chay = finish;
        while(chay != start){
            System.out.print(chay + "<-");
            chay = previous[chay];
        }
        System.out.println(chay);
    }
}
