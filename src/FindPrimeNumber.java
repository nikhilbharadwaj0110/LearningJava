public class FindPrimeNumber {
    public int sumOfDigits(int n) {
        int sumOfDigits = 0;
        int temp = 0;
        while (n > 0) {
            temp = n % 10;
            sumOfDigits = sumOfDigits + temp;
            n = n / 10;
        }
        return sumOfDigits;
    }

    public boolean isPrimeNumber(int n) {
        boolean primeNum = true;
        for (int x = 2; x < n; x++) {
            if (n % x == 0) {
                primeNum = false;
                break;
            }
        }
        return primeNum;
    }

    public void listPrimeNumbers(int a, int b) {
        int startNum = 0;
        int endNum = 0;
        if (a < b) {
            startNum = a;
            endNum = b;
        } else {
            startNum = b;
            endNum = a;
        }

        for (int i = startNum; i <= endNum; i++) {
            int sumOfDigits = sumOfDigits(i);
            if (isPrimeNumber(sumOfDigits) && i > 1) {
                System.out.println(i);
            }
        }

    }

    public static void main(String args[]) {
        FindPrimeNumber num = new FindPrimeNumber();
        num.listPrimeNumbers(1, 27);

    }
}
