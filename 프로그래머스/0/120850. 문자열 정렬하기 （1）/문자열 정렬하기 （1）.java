import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static List<Integer> solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();

        // 문자열을 순회하면서 숫자만 추출
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            }
        }

        // 리스트를 오름차순으로 정렬
        Collections.sort(numbers);

        return numbers;
    }
}