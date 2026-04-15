public class Ex41Circle {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름을 필드

    public double getArea() { // 멤버 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Ex41Circle pizza;
        pizza = new Ex41Circle(); // Circle 객체 생성
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex41Circle dount = new Ex41Circle(); // 객체를 생성과 동시에 초기화
        dount.radius = 2;
        dount.name = "도넛";
        area = dount.getArea();
        System.out.println(dount.name + "의 면적은 " + area);

    }
}
