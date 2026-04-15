class Circle {
    int radius;

    public Circle(int radius){ // 생성자 사용 
        this.radius = radius; // class 이름과 같은 메소드면 생성자
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
}
public class Ex46 {

    public static void main(String[] args) {
        Circle[] c; // 배열 선언
        c = new Circle[5]; // 배열 지정

        for (int i = 0; i < c.length; i++)
            c[i] = new Circle(i);

        for (int i = 0; i < c.length; i++)
            System.out.println((int) (c[i].getArea()) + " ");
    }
    
}
