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


        System.out.println(Account(4,8,9,15));
        System.out.println(Summ(5.8,20));
        Number(-5);
        System.out.println(Numder2(-10));
        printHello("Фанзиль");
           }

public static double Account(double a, double b, double c, double d){
        return a*(b+(c/d));
}

public static boolean Summ(double a, double b){
        return (a+b)>=10 && (a+b)<=20;
}

public static void  Number(int a){
        if (a<0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
    }}
public static boolean Numder2(int b){
        return b<0;
}

public static void printHello(String hello){
    System.out.println("Привет,"+ hello);
}
}
