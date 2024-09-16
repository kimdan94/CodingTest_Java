import java.util.*;

class Solution {
    public String solution(String my_string) {
        // 문자열을 소문자로 변환
        String lower = my_string.toLowerCase();
        // 소문자로 변환한 문자열을 문자 배열로 변환
        char[] charArray = lower.toCharArray();
        // 문자 배열을 알파벳 순으로 정렬
        Arrays.sort(charArray);
        // 정렬된 문자 배열을 다시 문자열로 변환
        String answer = new String(charArray);
        
        return answer;
    }
}