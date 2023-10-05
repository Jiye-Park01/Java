package TVUser;

public class TV {
	boolean status = false;
	int channel = 1;
	int volume = 5;
	
	final int channelFinish = 5;
	final int volumeFinish = 10;
	
	void pushPower() {		//TV 전원 ON/OFF 메서드
		if(status == false) {
			status = true;
			System.out.println("TV전원 ON");
		}
		else {
			status = false;
			System.out.println("TV전원 OFF");
		}
	}
	
	void channelUp() {		//TV 채널 초기값 1, 범위 1-5
		if(status == false)
			System.out.println("TV 전원을 켜주세요.");
		else {
			if(channel == channelFinish) {
				channel = 1;
				System.out.println("현재 채널: " + channel);
			}
			else {
				channel++;
				System.out.println("현재 채널: " + channel);
			}
		}
	}
	void channelDown() {
		if(status == false)
			System.out.println("TV 전원을 켜주세요.");
		else {
			if(channel == 1) {
				channel = 5;
				System.out.println("현재 채널: " + channel);
			}
			else {
				channel--;
				System.out.println("현재 채널: " + channel);
			}		
		}
	}
	
	void volumeUp() {		//TV 볼륨 초기값 5, 범위 1-10
		if(status == false)
			System.out.println("TV 전원을 켜주세요.");
		else {
			if(volume != volumeFinish) {
				volume++;
				System.out.println("현재 볼륨: " + volume);
			}
			else
				System.out.println("볼륨이 최대치입니다.");
		}
	}
	void volumeDown() {
		if(status == false)
			System.out.println("TV 전원을 켜주세요.");
		else {
			if(volume != 1) {
				volume--;
				System.out.println("현재 볼륨: " + volume);
			}
			else
				System.out.println("볼륨이 최소치 입니다.");
		}
	}
}
