class Solution {
    public int solution(int a, int b) {
        int first = Integer.valueOf((String.valueOf(a)+String.valueOf(b)));
        int second = Integer.valueOf((String.valueOf(b)+String.valueOf(a)));
        
        return first >= second ? first : second;
    }
}