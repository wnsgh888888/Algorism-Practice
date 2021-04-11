package Programers;

public class Programers11 {
	//10으로 나눈 나머지가 각 자릿값
	//long => String[] => 역순 => int[]
    public int[] solution(long n) {
    	   	
        String[] con = Long.toString(n).split("");
        String tmp = "";
        
        for(int i=0; i<con.length/2; i++) {
        	tmp = con[i];
        	con[i] = con[con.length-i-1];
        	con[con.length-i-1] = tmp;
        }
        
        int[] result = new int[con.length];
        
        for(int i=0; i<result.length; i++) {
        	result[i] = Integer.parseInt(con[i]);
        }
        
        return result;
    }

//n => String => paseInt => int[]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//문제 설명
//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//제한 조건
//n은 10,000,000,000이하인 자연수입니다.

