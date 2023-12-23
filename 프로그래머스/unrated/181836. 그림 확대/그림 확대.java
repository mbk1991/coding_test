class Solution {
    public String[] solution(String[] picture, int k) {
        //너비 확대
        for(int i=0; i<picture.length; i++){
            char[] tmp = picture[i].toCharArray();
            char[] zoomWidth = new char[tmp.length * k];
            for(int j=0; j<zoomWidth.length; j++){
                zoomWidth[j] = tmp[j/k];
            }
            picture[i] = new String(zoomWidth);
        }
        //높이 확대
        String[] answer = new String[picture.length*k];
        for(int i=0; i<answer.length; i++){
            answer[i] = picture[i/k];
        }
        return answer;
    }
}