package ex.lotto;

public class LottoCard {
    int mNum;
    Lotto[] mLottos;

    public LottoCard(int mNum) {
        if (mNum < 1 || mNum > 5) {
            System.out.println("구매 오류! \n구매할 수 있는 복권의 개수는 1개 ~ 5개입니다.");
            return;
        }
        this.mNum = mNum;
        mLottos = new Lotto[mNum]; // 복권 배열 초기화
    }

    public boolean auto(int idx) {
        if (idx < 1 || idx > mNum)
            return false;
        mLottos[idx - 1] = new Lotto();
        mLottos[idx - 1].generate();
        return true;
    }

    public boolean manual(int idx, int num1, int num2, int num3, int num4, int num5, int num6) {
        if (idx < 1 || idx > mNum) {
            System.out.println("유효하지 않은 인덱스입니다.");
            return false;
        }

        int[] numbers = { num1, num2, num3, num4, num5, num6 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 1 || numbers[i] > 45) {
                System.out.println(idx + "번 복권은 1에서 45 사이의 유효한 숫자를 가져야 합니다.");
                return false;
            }

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(idx + "번 복권은 중복된 숫자를 포함해서는 안됩니다.");
                    return false;
                }
            }
        }

        mLottos[idx - 1] = new Lotto(num1, num2, num3, num4, num5, num6);

        return true;
    }

    public boolean manual(int idx, int[] mLotto) {
        if (idx < 1 || idx > mNum) {
            System.out.println("유효하지 않은 인덱스입니다.");
            return false;
        }

        mLottos[idx - 1] = new Lotto(mLotto);
        if (!mLottos[idx - 1].verify()) {
            System.out.println(idx + "번 복권은 유효하지 않은 복권입니다.");
            mLottos[idx - 1] = null;
            return false;
        }

        return true;
    }

    public int[] get(int idx) {
        return mLottos[idx - 1].getNumbers();
    }

    public void show() {
        for (int i = 0; i < mNum; i++) {
            if (mLottos[i] != null) {
                System.out.print((i + 1) + "번: ");
                mLottos[i].show();
            }
        }
    }
}

