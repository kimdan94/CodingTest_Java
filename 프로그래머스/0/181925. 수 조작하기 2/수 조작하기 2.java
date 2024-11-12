public class Solution {
    public String solution(int[] numLog) {
        // 결과 문자열을 저장할 StringBuilder 초기화
        StringBuilder result = new StringBuilder();
        
        // numLog 배열의 첫 번째 요소부터 순회
        for (int i = 1; i < numLog.length; i++) {
            // 이전 값과 현재 값을 비교하여 조작을 추론
            int diff = numLog[i] - numLog[i - 1];
            
            // "w" : 수에 1을 더한 경우
            if (diff == 1) {
                result.append("w");
            } 
            // "s" : 수에 1을 뺀 경우
            else if (diff == -1) {
                result.append("s");
            } 
            // "d" : 수에 10을 더한 경우
            else if (diff == 10) {
                result.append("d");
            } 
            // "a" : 수에 10을 뺀 경우
            else if (diff == -10) {
                result.append("a");
            }
        }
        
        // StringBuilder를 문자열로 변환하여 결과 반환
        return result.toString();
    }
}