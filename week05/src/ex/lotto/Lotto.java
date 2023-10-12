package ex.lotto;

import java.util.Random;

public class Lotto {
	private int[] mLottoNumber = new int[6];
	public Lotto() {	//인자 없는 생성자 -> 로또 번호 자동 생성
		generate();
	}
	
//	public static void main(String[] args) {//검사
//		int num[] = {1,2,3,4,5,6};
//		for(int i = 0; i < num.length - 1; i++) {//i: 0-4
//			for(int j = i+1; j < num.length; j++) {
//				if(num[i] == num[j])
//					System.out.println("false");
//			}
//		}
//		System.out.println("true");;
//		
//	}
	
	public Lotto(int num1, int num2, int num3, int num4, int num5, int num6) {	//정수 6개 전달받음
		mLottoNumber[0] = num1;
		mLottoNumber[1] = num2;
		mLottoNumber[2] = num3;
		mLottoNumber[3] = num4;
		mLottoNumber[4] = num5;
		mLottoNumber[5] = num6;
	}
	public Lotto(int[] mLottoNumber) {		//정수 배열을 전달받음
		this.mLottoNumber = mLottoNumber;
	}
	
	
	public boolean mIsValid() {	//중복 검사
		for(int i = 0; i < mLottoNumber.length; i++) {
			for(int j = i+1; j < mLottoNumber.length; j++) {
				if(mLottoNumber[i] == mLottoNumber[j])
					return false;
			}
		}
		return true;
	}
	
	public boolean verify() {	//유효성 검사
	    for (int i : mLottoNumber) {
	        if (i < 1 || i > 45)
	            return false;
	    }
	    return mIsValid();
	}

	
//	

	public void generate() { // 로또 번호 자동 생성, 중복 체크를 통한 번호 생성
	    Random random = new Random();
	    int check = 1;
	    boolean bool;

	    mLottoNumber[0] = random.nextInt(45) + 1; // 맨 처음 번호는 랜덤으로 선택

	    while (check != 6) {
	        bool = true;
	        int randomNumber = random.nextInt(45) + 1;
	        
	        for (int i = 0; i < check; i++) {
	            if (mLottoNumber[i] == randomNumber) {
	                bool = false;
	                break; // 이미 선택된 번호와 중복이면 루프를 빠져나옵니다.
	            }
	        }

	        if (bool) {
	            mLottoNumber[check] = randomNumber;
	            check++;
	        }
	    }
	}


	public void show() {	//로또 번호 출력
	    if (verify() == false)
	        System.out.println("유효하지 않은 로또번호입니다.");
	    else {
	        System.out.print("[ ");
	        for (int i = 0; i < mLottoNumber.length; i++)
	            System.out.print(mLottoNumber[i] + " ");
	        System.out.println("]");
	    }
	}


	public int[] getNumbers() {		//로또번호를 반환
		int[] number = new int[6];
		if(verify() == false)
			return number;
		else {
			for(int i = 0; i < number.length; i++)
				number[i] = mLottoNumber[i];
			return number;
		}
	}
}
