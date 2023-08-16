class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");
        
        for(String i : array){
            cnt = i.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2==1 ? i.toUpperCase() : i.toLowerCase();
        }
        return answer;
    }
}