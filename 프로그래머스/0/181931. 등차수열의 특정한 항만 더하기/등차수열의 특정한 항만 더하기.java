class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        
        for(int i=0;i<included.length;i++){
            int term = a + (i * d);
            
            if(included[i] == true){
                sum += term;
            }
        }
        return sum;
    }
}