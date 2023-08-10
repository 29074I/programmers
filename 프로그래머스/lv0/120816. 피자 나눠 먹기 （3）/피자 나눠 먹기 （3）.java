class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for(int i = 1; i <=n; i++){
            if(i % slice == 0){
                answer = n/slice;
            } else if(i % slice > 0){
                answer = n/slice+1;
            }
        }
        return answer;
    }
}