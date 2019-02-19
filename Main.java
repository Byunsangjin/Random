import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyRandom random = new MyRandom();

        int testCase = 10; // 테스트 케이스 0 ~ 9
        int count[] = new int[testCase];

        for (int i = 0; i < 30; i++) { // 30번을 호출 했을 때
            int result = random.get_random(testCase);
            count[result]++;
        }

        for (int i = 0; i < testCase; i++) {
            System.out.println(i + "의 개수 = " + count[i]);
        }
    }
}

class MyRandom {
    // 0 or 1을 랜덤으로 리턴하는 함수
    public int get_zero_or_one() {
        return new Random().nextInt(2);
    }

    // 0 ~ (max_number - 1) 사이의 값을 랜덤으로 리턴하는 함수
    public int get_random(int max_number) {
        // max_number가 0보다 작다면 예외처리
        if (max_number < 0) {
            System.out.println("입력값이 0보다 작습니다.");
            return -1;
        }

        int sum = 0;

        for (int i = 0; i < max_number; i++) {
            sum += get_zero_or_one() * i;
        }

        return sum % max_number;
    }
}

