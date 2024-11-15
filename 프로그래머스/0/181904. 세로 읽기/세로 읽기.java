public class Solution {
    public String solution(String myString, int m, int c) {
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();

        // c번째 열에 해당하는 문자를 추출하기 위해 루프를 설정
        // c는 1부터 시작하는 위치이므로 인덱스에서 1을 빼줍니다 (0부터 시작하는 인덱스 맞추기)
        // 이후 m씩 증가하며 다음 줄의 c번째 열에 해당하는 문자에 접근합니다.
        for (int i = c - 1; i < myString.length(); i += m) {
            // i번째 위치의 문자를 result에 추가
            result.append(myString.charAt(i));
        }

        // 최종적으로 StringBuilder에 모인 문자를 문자열로 변환하여 반환
        return result.toString();
    }
}