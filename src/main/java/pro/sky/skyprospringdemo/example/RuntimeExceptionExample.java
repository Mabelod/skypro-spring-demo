package pro.sky.skyprospringdemo.example;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        int number = 1;
        if (number != 2) {
            throw new RuntimeException("Number is not 2");
        }
    }
}
