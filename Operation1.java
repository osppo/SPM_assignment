import java.util.Random;

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
