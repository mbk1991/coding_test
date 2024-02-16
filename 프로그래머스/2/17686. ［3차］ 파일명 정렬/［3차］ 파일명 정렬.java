import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        List<FileName> fList = new ArrayList<>();
        
        for(int i=0; i<files.length; i++){
            fList.add(new FileName(files[i]));
        }
        
        Collections.sort(fList);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = fList.get(i).getFileNameOrigin();
        }
        
        return answer;
    }
}

class FileName implements Comparable<FileName>{
    private final String fileNameOrigin;
    private String head;
    private int number;
    private int tail;
    
    public FileName(String fileNameOrigin){
        this.fileNameOrigin = fileNameOrigin;
        this.set(fileNameOrigin);
        
    }
    
    private void set(String fileNameOrigin){
        StringBuffer hb = new StringBuffer();
        StringBuffer nb = new StringBuffer();
        boolean isHead = true;
        boolean isNumber = true;
        
        for(char c:fileNameOrigin.toCharArray()){
            if(!Character.isDigit(c) && isHead){
                hb.append(c);
            }else if(Character.isDigit(c) && isNumber){
                isHead = false;
                nb.append(c);
                if(nb.length() == 5) isNumber = false;
            }else{
                break;
            }
        }
        this.head = hb.toString().toLowerCase();
        this.number = Integer.parseInt(nb.toString());
    }
    
    public String getFileNameOrigin(){
        return fileNameOrigin;
    }
    public String getHead(){
        return head;
    }
    public int getNumber(){
        return number;
    }
    
    @Override
    public int compareTo(FileName f){
        if(this.getHead().compareTo(f.getHead()) > 0){
            return 1;
        }else if(this.getHead().compareTo(f.getHead()) < 0){
            return -1;
        }else{
                if(this.getNumber() > f.getNumber()){
                    return 1;
                }else if(this.getNumber() < f.getNumber()){
                    return -1;
                }else{
                    return 0;
                }
        }
    }
        
}