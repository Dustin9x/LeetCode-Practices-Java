public class _1108_DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        for (char c: address.toCharArray()) {
            if(c == '.'){
                res.append("[.]");
                continue;
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
