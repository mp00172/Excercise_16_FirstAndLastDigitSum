public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit > 9) {
            firstDigit -= firstDigit % 10;
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }
}
