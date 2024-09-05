package chp07.ex11;

public class Maincylinder {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 4;
        c.height = 5;

        System.out.printf("원기둥의 부피: %.2f\n",c.getVolum());
        System.out.printf("원기둥의 겉넓이: %.2f\n",c.getcircleArea());
    }
}
