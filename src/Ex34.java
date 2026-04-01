public class Ex34 {
    public static void main(String[] args) {
        
        for (int i = 1; i < 10; i++){
            System.out.println(i + "단"); // 순서가 중요 한번만 보여줄거니까 밑에 for문 위에 두는게 중요
            for (int j = 2; j < 10; j++){
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
        }
            
    }
}
