package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp2 {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		// 친구정보 3명 입력 로직 --> 반복문 사용
		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보
			System.out.print("이름");
			String name = sc.nextLine();
			System.out.print("핸드폰");
			String hp = sc.nextLine();
			System.out.print("학교");
			String school = sc.nextLine();
			System.out.println("----------------------------");
			
			// Friend 객체 생성하여 데이터 넣기
			Friend friend = new Friend();
			friend.setName(name);
			friend.setHp(hp);
			friend.setSchool(school);
			
			// 배열에 추가
			friendArray[i] = friend;
		}

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {
			friendArray[i].showInfo();
		}

		sc.close();
	}

}
