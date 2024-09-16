class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1 ; i <= n ; i++){
            if((6 * i)% n == 0){
                answer = i;
                break; //만족할 경우 함수 자체를 탈출하도록함
            }
        }
        return answer;
    }
}