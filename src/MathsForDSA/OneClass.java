package MathsForDSA;

public class OneClass {
    public static void main(String[] args) {
       decimalToBinary(34);
    }
  static void decimalToBinary(int decimalNum){
        int resNum = 0;
        int power = 0;
        while (decimalNum>0){
            int rem = decimalNum%2;
            decimalNum/=2;
            resNum += rem * Math.pow(10,power);
            power++;
        }
      System.out.println("Result is "+ resNum);
    }
}
