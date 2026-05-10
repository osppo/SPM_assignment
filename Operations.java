class Operations {

    public static void main(String[] args) {
        System.out.println("add 2+3 : " + add(2,3));
        System.out.println("subtract 3-2 : " + subtract(3,2));
        System.out.println("multiply 4*5 : " + multiply(4,5));
        System.out.println("divide 10/2 : " + divide(10,2));
    }

    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int subtract(int num1,int num2){
        return num1-num2;
    }
    public static int multiply(int num1,int num2){
        return num1*num2;
    }
    public static int divide(int num1,int num2){
        return num1/num2;
    }
}
