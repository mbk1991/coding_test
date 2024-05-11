import java.util.*;

public class Main{

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] nArr = input.split("[+-]");
        String[] oArr = splitOperator(input);

        int sum = 0;
        boolean afterMinus = false;

        sum += Integer.parseInt(nArr[0]);
        for(int i=0; i<oArr.length; i++){
            if(oArr[i].equals("-")){
                sum -= Integer.parseInt(nArr[i+1]);
                afterMinus = true;
            }else if(afterMinus && oArr[i].equals("+")){
                sum -= Integer.parseInt(nArr[i+1]);
            }else{
                sum += Integer.parseInt(nArr[i+1]);
            }
        }

        System.out.println(sum);
    }

    private static String[] splitOperator(String input) {
        String[] oArr = new String[input.length()];
        int i = 0;
        for(char c:input.toCharArray()){
            if(!Character.isDigit(c)){
                oArr[i] = c+"";
                i++;
            }
        }
        return Arrays.copyOf(oArr,i);
    }
    
    
}