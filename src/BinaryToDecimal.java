public class BinaryToDecimal {
    private int binaryNumber;
    private int binaryNumberLength;

    public BinaryToDecimal(int binaryNumber, int binaryNumberLength) {
        this.binaryNumber = binaryNumber;
        this.binaryNumberLength = binaryNumberLength;
    }

    public int exponent(int a, int b) {
        int result = a;
        if (b == 0) {
            return 1;
        } else {
            for (int i = 0; i < b - 1; i++) {
                result = result * a;
            }
            return result;
        }

    }

    public int convertBinToDec() {
        int result = 0;
        int remainder = 0;
        for (int i = 0; i < this.binaryNumberLength; i++) {
            remainder = this.binaryNumber % 10;
            result = ((exponent(2, i)) * remainder) + result;
            // System.out.println(i);
            // System.out.println("remainder:" + remainder);
            // System.out.println("result:" + result);
            this.binaryNumber = this.binaryNumber / 10;
        }
        return result;

    }

    public static void main(String args[]) {

        int binaryNum = 10001;
        BinaryToDecimal b1 = new BinaryToDecimal(binaryNum, 5);

        int decimal = b1.convertBinToDec();
        System.out.println("Decimal value of " + binaryNum + " is: " + decimal);
        // System.out.println(b1.exponent(2, 3));

        // this is a new line 
    }

}
