class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        String reversedPart = new StringBuilder(my_string.substring(s,e+1)).reverse().toString();
        
        sb.replace(s, e+1, reversedPart);
        
        return sb.toString();
    }
}