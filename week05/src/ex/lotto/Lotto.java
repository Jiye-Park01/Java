package ex.lotto;

import java.util.Random;

public class Lotto {
	private int[] mLottoNumber = new int[6];
	public Lotto() {
		
	}
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
			for(int j = i+1; i < mLottoNumber.length; j++) {
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

	
	public void generate() {	//로또 번호 자동 생성
	    Random random = new Random();
	    do {
	        for (int i = 0; i < mLottoNumber.length; i++)
	            mLottoNumber[i] = random.nextInt(45) + 1;
	    } while (!verify());
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
