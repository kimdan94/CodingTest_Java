class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n이 홀수인 경우
        if(n%2 !=0){
            for(int i=1;i<=n;i+=2){
                answer += i;
            }
        }
        
        // n이 짝수인 경우
        else{
            for(int i=2;i<=n;i+=2){
                answer += i * i;
            }
        }
        
        return answer;
    }
}