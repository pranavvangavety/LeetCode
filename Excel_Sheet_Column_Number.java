public class Excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        Excel_Sheet_Column_Number solution = new Excel_Sheet_Column_Number();

        System.out.println(solution.titleToNumber("A"));

    }
}
