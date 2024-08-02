package com.project.ssm.admin;

import java.util.Scanner;

import com.project.ssm.data.Data;
import com.project.ssm.matching.MatchingResultUser;

/**
 * 관리자: 매칭 회원 정보 리스트입니다.
 * @author 김경현, 김유진
 */
public class AdminMatchingInterface {
	
	/**
	 * 관리자 매칭 조회 메소드
	 */
	public void matchingInterface(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===================================================================================");
		System.out.println("                                    매칭 결과 리스트");
		System.out.println("===================================================================================");
		System.out.println();
		System.out.println("[번호]\t[학번]\t\t[이름]\t[학과]\t[학번]\t\t[이름]\t[학과]\t[카테고리]");
		
		for (MatchingResultUser matchingResultUser : Data.matchingResultUserList) {
			
			System.out.printf("%4s\t%8s\t%s\t%s\t%s\t%s\t%s\t%s\n"
									, matchingResultUser.getMatchingNumber()
									, matchingResultUser.getId()
									, matchingResultUser.getName()
									, matchingResultUser.getMajor()
									, matchingResultUser.getOtherId()
									, matchingResultUser.getOtherName()
									, matchingResultUser.getOtherMajor()
									, matchingResultUser.getCategory());
			
		}
		System.out.println();
		System.out.println("===================================================================================");
		System.out.println("                                     0. 뒤로가기");
		System.out.println("===================================================================================");
		System.out.print("                                     ▶  ");
		String sel = scan.nextLine();
		

		
		if (sel.equals("0")) {
			
			System.out.println("관리자 페이지로 돌아갑니다..");
			
		}
		
		
		
	}

}
