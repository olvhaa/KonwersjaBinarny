public class Main{
    public static void main(String[] args) {
        System.out.println("Podaj liczbe w systemie dziesietnym zeby zmienic ja ");
    }
    public static int getBinaryNumber(int decimalNumber){
        String binaryString = " ";
        int binaryNumber;
        int bit;
        if(decimalNumber != 0){
            do{
                bit = decimalNumber % 2;
                decimalNumber = decimalNumber /2;
                binaryString = String.valueOf(bit).concat(binaryString);

            }while (decimalNumber != 1);
        }
        else return 0;
        binaryString = "1".concat(binaryString);
        binaryNumber = Integer.parseInt(binaryString);
        return binaryNumber;
    }
}