import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        Arrays.sort(num_list);
        
        List<Integer> answer = new ArrayList<>();
        for(int i=5;i<num_list.length;i++){
            answer.add(num_list[i]);
        }
        return answer;
    }
}