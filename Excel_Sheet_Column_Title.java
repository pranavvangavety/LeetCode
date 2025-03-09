public class Excel_Sheet_Column_Title {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        int n = columnNumber;

        while(n>0){
            n--;
            char letter = (char)('A' + (n%26));
            result.append(letter);
            n = n/26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(convertToTitle(28));
    }
}
