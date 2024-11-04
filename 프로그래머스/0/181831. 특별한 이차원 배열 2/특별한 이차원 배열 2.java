class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;  // 행의 개수

        for (int i = 0; i < n; i++) {
            // 각 행의 열 개수를 확인하여 그 범위 안에서만 비교
            for (int j = 0; j < arr[i].length; j++) {
                // 대칭 여부 확인
                if (i < arr[j].length && arr[i][j] != arr[j][i]) {
                    return 0;  // 대칭이 아니면 0을 반환
                }
            }
        }
        
        return 1;  // 모든 요소가 대칭을 이루면 1을 반환
    }
}
