import java.util.Random;

class Operations {

    public static void main(String[] args) {
        System.out.println("add 2+3 : " + add(2,3));
        System.out.println("subtract 3-2 : " + subtract(3,2));
        System.out.println("average of 4 and 8 : " + average(4,8));
        System.out.println("percentage of 3 out of 12 : " + smallerToLargerPercentage(3,12) + "%");
        System.out.println("Random result: " + randomNumber());
    }

    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static int subtract(int num1,int num2){
        return num1-num2;
    }

    public static double average(double num1, double num2){
        return (num1 + num2) / 2;
    }

    public static double smallerToLargerPercentage(double num1, double num2){
        double smaller = Math.min(num1, num2);
        double larger = Math.max(num1, num2);
        return (smaller / larger) * 100;
    }

    public static int randomNumber(){
        Random rand = new Random();
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(20) + 1;
        return num1 + num2;
    }
}
public class Main {

    public static int randomNumber() {
        Random rand = new Random();

        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(20) + 1;

        int result = num1 + num2;

        return result;
    }

    public static void main(String[] args) {
        int answer = randomNumber();
        System.out.println("Random result: " + answer);
    }
}
