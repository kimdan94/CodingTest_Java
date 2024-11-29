import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(String str : intStrs){
            int endIndex = s + l; // s부터 길이 l만큼 자르기
            int strValue = Integer.parseInt(str.substring(s, endIndex)); // str 사용
            
            if(k < strValue){
                answer.add(strValue);
            }
        }
        
        // 리스트를 배열로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
