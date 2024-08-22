class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int index = 0;
        
        // 배열 크기지정
        if(num_list.length % n == 0) {
        	answer = new int[num_list.length/n];
        }else {
        	answer = new int[num_list.length/n + 1];
        }
        
        for(int i=0; i<num_list.length; i+=n) {
        	answer[index] = num_list[i];
        	index++;
        }
        
        
        return answer;
    }
}