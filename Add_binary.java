public class Add_binary {
    public static String addBinary(String a, String b){
        StringBuilder x = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >=0 || j>=0 || carry>0){
            int sum = carry;

            if(i>=0){
                sum+= a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum+= b.charAt(j) - '0';
                j--;
            }
            x.append(sum % 2);
            carry= sum/2;
        }

        return x.reverse().toString();
    }

    public static void main(String[] args){
        String a = "1", b = "1";
        System.out.println(addBinary(a,b));
    }
}
