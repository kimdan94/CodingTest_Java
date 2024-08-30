import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNum = new StringBuilder();
        StringBuilder evenNum = new StringBuilder();
        
        for(int num : num_list){
            if(num % 2 == 0){
                evenNum.append(num);
            }else{
                oddNum.append(num);
            }
        }
        
        int oddNumber = Integer.parseInt(oddNum.toString());
        int evenNumber = Integer.parseInt(evenNum.toString());
        
        return oddNumber + evenNumber;
    }
}