public class _1672_RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int CustQty = accounts.length;
        int BankQty = accounts[0].length;
        int Max = 0;

        for (int i = 0; i < CustQty; i++) {
            int CustWealth = 0;
            for (int j = 0; j < BankQty; j++) {
                CustWealth += accounts[i][j];
            }
            if (CustWealth > Max){
                Max = CustWealth;
            }
        }
        System.out.println(Max);
        return Max;
    }

    public static void main(String[] args) {
        int test[][] = {{1,2,4},{3,4,1}};
        maximumWealth(test);
    }
}
