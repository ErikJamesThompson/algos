public class EqualThree {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);
        boolean firsty = firstNumber == secondNumber;
        boolean secondy = firstNumber == thirdNumber;

        System.out.println(firsty && secondy);
    }
}
