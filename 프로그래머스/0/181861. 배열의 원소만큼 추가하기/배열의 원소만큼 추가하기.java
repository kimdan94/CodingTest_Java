import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 빈 배열 answer를 ArrayList로 초기화 (동적으로 크기를 늘리기 위해)
        List<Integer> answer = new ArrayList<>();
        
        // 배열 arr의 각 원소에 대해 반복
        for(int a : arr){
            for(int i=0;i<a;i++){
                answer.add(a);
            }
        }
        
        int[] result = new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}