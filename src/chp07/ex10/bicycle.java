package chp07.ex10;

public class bicycle {
    String name;
    double weight;
    int price;

    public static void main(String[] args) {
        bicycle b1 = new bicycle();

        b1.name = "로드형 자전거";
        b1.weight = 7.4;
        int price = 50;
        System.out.printf("b1 => %s, %2f, %d\n", b1.name, b1.weight, price);


    }
}
