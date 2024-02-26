package com.project.ssm.board;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.ssm.data.Data;

public class BoardInterface {
		
	public void boardMain() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		
		while(loop) {
		
			System.out.println();
			System.out.println("===============================");
			System.out.println("             게시판");
			System.out.println("===============================");
		    
			System.out.println();
		    System.out.println("————————————————————————————————————————————————--------");
	        System.out.println("|        1.자유 게시판		|       2. 장터 게시판	|");
	        System.out.println("|—————————————————————————————————————————————----------|");
	        System.out.println("|        3.문의 게시판		|      4. 내가 쓴 글	|");
	        System.out.println("|————————————————————------——————————————————————-------|");
	        System.out.println("|          5. 글 검색		|       0. 뒤로가기	|");
	        System.out.println("————————————————————————————————————————————————--------");
	        System.out.println();
			
			System.out.println();
			System.out.print("메뉴 선택 : ");
			String select = scan.nextLine();
			
			if(select.equals("1")) {
				
				//1. 자유게시판
				FreeBoard freeBoard = new FreeBoard();
				freeBoard.mainInterface();
				
			}else if(select.equals("2")) {
				
				//2. 장터게시판
				MarketBoard marketBoard = new MarketBoard();
				marketBoard.mainInterface();
				
			}else if(select.equals("3")) {
				
				//3. 문의게시판
				InquiryBoard inquiryBoard = new InquiryBoard();
				inquiryBoard.mainInterface();
				
			}else if(select.equals("4")) {
				
				//4. 내가 쓴 글
				MyBoard myBoard = new MyBoard();
				myBoard.mainInterface();
				
			}else if(select.equals("5")) {
				
				//5. 글 검색
				SearchBoard searchBoard = new SearchBoard();
				searchBoard.mainInterface();
				
			}else if(select.equals("0")) {
				
				loop = false;
				
			}else {
				
				System.out.println("잘못 입력하였습니다.");
				Data.pause();
				
			}
			
		}
		
	}
		
	

}
