class Solution {
    public String solution(String new_id) {
        String answer = "";
        String possibleChar =".-_abcdefghijklmnopqrstuvwxyz"
							+"01234567890";
		
		
		
		//1단계 소문자 치환
		new_id = new_id.toLowerCase();
		//2단계 소문자,숫자,빼기,밑줄,마침표를 제외한 문자제거
		for( int i = 0 ; i < new_id.length();i++) {
			int tempCheck = 0;
			System.out.println(new_id.charAt(i));
			for( int j = 0 ; j<possibleChar.length();j++) {
				if(new_id.charAt(i) == possibleChar.charAt(j)) {
					tempCheck++;			
				}
			}
			if(tempCheck==0) {
				System.out.println(new_id.charAt(i));
				new_id = new_id.replace(new_id.charAt(i),' ');
			}
		}
		new_id = new_id.replaceAll(" ","");
		System.out.println("2단계:"+new_id.toString());
		//3단계 마침표가 2번 이상 연속된부분은 하나의 마침표로 치환
		for(int k =0; k<new_id.length()-1;k++) {
			if((new_id.charAt(k)=='.')&&(new_id.charAt(k+1)=='.')) {
				new_id = new_id.substring(0,k)+new_id.substring(k+1);
				k--;
			}
		}
		System.out.println("3단계:"+new_id.toString());
		
		//4단계 첫 끝 마침표(.) 제거
		if(new_id.startsWith(".")) {
			new_id= new_id.substring(1);
		}
		if(new_id.endsWith(".")) {
			new_id = new_id.substring(0, new_id.length()-1);
		}
		System.out.println("4단계:"+new_id.toString());
		
		//5단계 빈 문자열이라면 a를 대입
		if(new_id.isEmpty()) {
			new_id = "a";
		}
		System.out.println("5단계:"+new_id.toString());
		//6단계 16자 이상일 경우 첫 15문자까지만
		if(new_id.length()>=16) {
			new_id = new_id.substring(0, 15);
		}
		if(new_id.charAt(new_id.length()-1)=='.') {
			new_id = new_id.substring(0,new_id.length()-1);
		}
		System.out.println("6단계:"+new_id.toString());
		//7단계길이가 2자 이하라면 마지막 문자를 길이가 3이 될때까지 추가
		if(new_id.length()<=2) {
			for(int n = 0;n<=(3-new_id.length());n++) {
				new_id += new_id.charAt(new_id.length()-1);
			}
		}
		
		System.out.println("7단계:"+new_id.toString());
		
	

        
        answer = new_id;
        
        
        
        return answer;
    }
}