class Solution {
    public int solution(int n) {
        if(n < 4){ // n이 3 이하일 경우 합성수는 없기 때문
            return 0; 
        }
        
        int count = 0;
        
        for(int i=4; i<=n; i++){ // 4부터 n까지의 모든 수를 확인
            boolean isPrime = true; // 소수인지 여부
            
            for(int j=2; j<=Math.sqrt(i); j++){ // i가 소수인지 확인
                if(i % j == 0){
                    isPrime = false; // 약수가 존재하므로 소수가 아님
                    break;
                }
            }
            
            if(!isPrime){
                count++;
            }
        }
        
        return count;
    }
}