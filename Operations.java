class Operations {

    public static void main(String[] args) {
        System.out.println("add 2+3 : " + add(2,3));
        System.out.println("subtract 3-2 : " + subtract(3,2));
    }

    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int subtract(int num1,int num2){
        return num1-num2;
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
