package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		Set<Integer> lotto=new HashSet<Integer>();
		int n=0;
		while(true) {
			if(lotto.size()==6) {
				break;
			}
			lotto.add(Ltto());
			n++;
		}
		System.out.println(lotto+", "+n+"회반복");
	}
	
	static Integer Ltto() {
		return (int)(Math.random()*45)+1;
	}

}
