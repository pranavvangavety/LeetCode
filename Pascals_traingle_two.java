import java.util.*;

public class Pascals_traingle_two {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            row.add( (int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i) ); //Formula for Pascal's Triangle
        }

        return row;
    }

    public static void main(String[] args) {
        int rowIndex = 4;
        List<Integer> result = getRow(rowIndex);

        System.out.println(result);
    }
}
