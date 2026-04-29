public class Ex51 {

    static void main(String[] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1,2); // Point 클래스의 set() 호출
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4); // Point 클래스의 set() 호출
        cp.setColor("red"); // ColorPoint의 setColor() 호출
        cp.showColorPoint(); // 컬러와 좌표 출력
    }
}

class Point { // 포인트 클래스가 슈퍼 클래스
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}