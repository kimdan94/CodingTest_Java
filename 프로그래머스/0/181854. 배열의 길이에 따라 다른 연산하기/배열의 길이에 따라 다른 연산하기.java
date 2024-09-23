public class Solution {
    public int[] solution(int[] arr, int n) {
        // 배열의 길이를 확인
        int length = arr.length;

        // 배열을 순회하면서 적절한 인덱스에 n을 더해줍니다.
        for (int i = 0; i < length; i++) {
            // 배열의 길이가 홀수인 경우: 짝수 인덱스에 n을 더합니다.
            if (length % 2 == 1 && i % 2 == 0) {
                arr[i] += n;
            }
            // 배열의 길이가 짝수인 경우: 홀수 인덱스에 n을 더합니다.
            else if (length % 2 == 0 && i % 2 == 1) {
                arr[i] += n;
            }
        }

        // 수정된 배열을 반환합니다.
        return arr;
    }
}