package TVUser;

import java.util.Scanner;

public class TVUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TV tv1 = new TV();	//tv 전원 off인 상태에서 볼륨 조절 시도
		//TV tv2 = new TV();	//tv 전원 on, 채널 1개 높인 뒤 채널 출력, 채널 1개 낮춘 뒤 채널 출력, 볼륨 1개 높인 뒤 볼륨 출력, 볼륨 1개 낮춘 뒤 볼륨 출력, 볼륨 6개 높인 뒤 볼륨출력, 전원OFF
		
		//사용자에게 메뉴 출력
		System.out.println("메뉴를 선택하세요. \n1. 전원ON/OFF    2.채널Up    3. 채널Down\n4. 볼륨Up    5. 볼륨Down");
		
		//메뉴를 처음에 입력 받고 만약 전원 ON을 선택할 시 while문 동작
		int menu = sc.nextInt();
		if(menu == 1)
			tv1.pushPower();
		
		//사용자 입출력에 따른 메뉴 만들기
		while(tv1.status == true) {
			menu = sc.nextInt();
			if(menu == 1)
				tv1.pushPower();
			else if(menu == 2)
				tv1.channelUp();
			else if(menu == 3)
				tv1.channelDown();
			else if(menu == 4)
				tv1.volumeUp();
			else if(menu == 5)
				tv1.volumeDown();
			else 
				System.out.println("메뉴에 없습니다. 다시 선택하세요.");
		}
		/*
		System.out.println("----TV1 동작-----");
		tv1.volumeDown();
		tv1.channelUp();
		tv1.pushPower();
		tv1.pushPower();
		
		
		System.out.println("-----TV2 동작-----");
		tv2.pushPower();
		tv2.channelUp();
		tv2.channelDown();
		tv2.volumeUp();
		tv2.volumeDown();
		for(int i = 0; i < 10; i++) {
			if(tv2.volume == 10) {
				System.out.println("볼륨이 최대치입니다.");
				break;
			}
			else
				tv2.volumeUp();
		}
		
		for(int i = 0; i < 10; i++) 
			tv2.channelDown();
		tv2.pushPower();
		*/
	}
}
