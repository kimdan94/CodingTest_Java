class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        
        // 나이를 문자열로 변환
        String ageStr = Integer.toString(age);
        
        // 각 숫자를 알파벳으로 변환하여 결과 문자열에 추가
        for (char c : ageStr.toCharArray()){
            // '0'의 ASCII 값이 48이므로 48을 빼서 'a'부터 시작하게 함
            result.append((char) ('a' + (c-'0')));
        }
        return result.toString();
    }
}