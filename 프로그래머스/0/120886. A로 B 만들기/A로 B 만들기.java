import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer;
        char[] beAry = before.toCharArray();
        char[] afAry = after.toCharArray();
        
        Arrays.sort(beAry);
        Arrays.sort(afAry);
        
        if(Arrays.equals(beAry,afAry)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}