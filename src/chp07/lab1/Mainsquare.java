package chp07.lab1;

public class Mainsquare {
    public static void main(String[] args) {
        square a1 = new square();
        a1.setLength(12);
        int result1 = a1.area();

        square a2 = new square();
        a2.setLength(12);
        int result2 = a2.area();

        System.out.printf("한 변의 길이가 %dcm, 넓이는 %d",
                a1.getLength(), result1);

        System.out.printf("한 변의 길이가 %dcm, 넓이는 %d",
                a2.getLength(), result2);

    }
}