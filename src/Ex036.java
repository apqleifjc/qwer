import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("exit를 입력하면 종료합니다.");
        while (true) { // 무한루프
            System.out.print(">> ");
            String text = scanner.nextLine();
            if (text.equals("exit")){ // exit가 입력되면 종료
                break; // while문을 벗어남
            }
        }
        System.out.println("종료합니다...");

        scanner.close();
    }
}
