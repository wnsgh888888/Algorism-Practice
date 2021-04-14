package Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programers22 {
	class Solution {
	    public String solution(String[] all, String[] pass) {
	    	
	    	Arrays.sort(all);
	    	Arrays.sort(pass);
	    	int i;
	    	
	    	for(i=0; i<pass.length; i++) {
	    		if(!pass[i].equals(all[i]))
	    			return all[i]; 
	    	}
	    	
	        return all[i];
	    }
		
		public String solution2(String[] all, String[] pass) {
	    	
	    	List<String> tmpall= new ArrayList<>(Arrays.asList(all));
	    	List<String> tmppass= new ArrayList<>(Arrays.asList(pass));
	    	
	    	for(String i : tmppass) {
	    		tmpall.remove(i);
	    	}
	    	
	        return tmpall.get(0);
	    }
	}
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programers22 obj = new Programers22();
	}

}
//문제 설명
//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//제한사항
//마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//completion의 길이는 participant의 길이보다 1 작습니다.
//참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//참가자 중에는 동명이인이 있을 수 있습니다.