public class MainClass {
    public static void main(String[] args) {

        byte a = 10;
        short b = 1232;
        int c = 1000;
        long d = 300000L;
        float e = 15.57f;
        double g = 256.587;
        char k = '\u2565';
        boolean s = true;

        System.out.println(account(4,8,9,15));
        System.out.println(summ(5.8,20));
        number(-5);
        System.out.println(numder2(-5));
        printHello("Фанзиль");
        year(204);
    }
    // Задание 3
    public static double account(double a, double b, double c, double d){
        return a*(b+(c/d));
    }
    // Задание 4
    public static boolean summ(double a, double b){
        return (a+b)>=10 && (a+b)<=20;
    }
    // Задание 5
    public static void  number(int a){
        if (a<0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }}
    // Задание 6
    public static boolean numder2(int b){
        return b<0;
    }
    // Задание 7
    public static void printHello(String hello){
        System.out.println("Привет,"+ hello);
    }
    // Задание 8
    public static void year(int a){
        if (a % 4 == 0 && a % 400 == 0) {
            System.out.println("Високосный");
        }
        if (a % 4 == 0 && a < 100 ) {
            System.out.println("Високосный");
        }
        if (a % 4 == 0 && a % 100 != 0 ) {
            System.out.println("Високосный");
        }
    }
}