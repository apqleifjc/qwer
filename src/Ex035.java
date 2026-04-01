import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5 개 입력하세요.");
        int sum = 0;
        for (int i =0; i < 5; i++){ // 5번 반복하지만 continue문 때문에 양수만 덧셈이 이뤄짐
            int n = scanner.nextInt(); // 정수를 넣는 함수
            if (n <= 0){
                continue; // 0이나 음수인 경우 다음 반복으로 진행
            }
            else {
                sum += n;
            }
        }
            System.out.println("양수의 합은"+ sum);

            scanner.close();
        
    }
}
