import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // "x"로 분리된 문자열 배열을 선언합니다.
        String[] splitArr = myString.trim().split("x");
        
        // 배열을 정렬합니다.
        Arrays.sort(splitArr);
        
        // 빈 문자열을 제외하고 결과를 반환
        return Arrays.stream(splitArr)
                     .filter(s -> !s.isEmpty()) // 빈 문자열 필터링
                     .toArray(String[]::new);
    }
}
