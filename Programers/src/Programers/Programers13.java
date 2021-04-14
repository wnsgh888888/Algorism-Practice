package Programers;

public class Programers13 {
   
	public String solution(String s) {

    	String result = "";
    	int len = s.length();
    
    	if(len % 2 == 0) 
    		result = s.substring((len / 2) - 1, (len / 2) + 1);
    	
    	else if(len % 2 == 1 && len != 1)
    		result = s.substring((len / 2), (len / 2) + 1); 
    	
    	else 
    		result = s;
    	
    	return result;
    }
	
	public static void main(String[] args) {
		
		Programers13 obj = new Programers13();
		
		System.out.println(obj.solution("avcd"));
		// TODO Auto-generated method stub
		
	}

}
//문제 설명
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//재한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.

//if로 조건 두가지 나누기 => 길이를 구해 반으로 나누어 가운데 위치 찾고 반환