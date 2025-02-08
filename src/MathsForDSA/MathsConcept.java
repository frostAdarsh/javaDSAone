package MathsForDSA;

public class MathsConcept {
    public static void main(String[] args) {
//   countDigits(45);
//   countDigitSViaLog(45);
//   armstrongNumber(153);
//    palindrome(1331);
//    primeNumber(15);
//     GCD(23,15);
//        euclideanGCD(24,36);
        findTrailingZerosInFactorial(30);
    }
    public static  void countDigits(int num){
        if(num==0){
            System.out.println("Digits are : 1");
            return;
        }
        int counter = 0;
        while (num>0){
            num/=10;
            counter++;
        }
        System.out.println("Digit are : " + counter);
    }
    public  static  void countDigitSViaLog(int num){
        if(num==0){
            System.out.println("Digits are : 1");
            return;
        }
        int count = (int) (Math.log(num)/Math.log(10))+1;
        System.out.println("Digit are : " + count);
    }
    public  static  void armstrongNumber(int num){
        int res = 0;
        int copy = num;
        while (num>0){
            int digit = num%10;
            res = res + (int) Math.pow(digit,3);
            num /= 10;
        }
        System.out.println(res==copy);
    }
    public  static  void palindrome(int num){
        int res=0;
        int copy = num;
        while (num>0){
            int digit = num%10;
            res = res*10 + digit;
            num /= 10;
        }
        System.out.println(res==copy);
    }
    public  static  void primeNumber(int num){
        int counter = 2;
        int sqroot = (int)Math.sqrt(num);
        while (counter <= sqroot) {
            if (num % counter == 0) {
                System.out.println(num + " is not a prime number ");
                return;
            }
            counter++;
        }
        System.out.println(num + " is a prime number ");
    }
    public  static  void  GCD(int num1,int num2){
       int min = (num1<=num2)?num1:num2;
       while (min>0){
           if(num1%min==0 && num2%min==0){
               System.out.println("GCD is: "+min);
               break;
           }
           min--;
       }
       int max = (num1<=num2)?num2:num1;
        System.out.println("GCD iS : "+ max);
    }
    public  static  void euclideanGCD(int num1, int num2){
        while (num1!=0 && num2!=0){
            if(num1>num2){
                num1 -=num2;
            }
            else {
                num2 -= num1;
            }
        }
        int res = num1;
        if(num1 == 0){
            res = num2;
        }
        System.out.println("GCD is "+ res);
    }
    public  static  void findTrailingZerosInFactorial(int num){
        double res = 0;
        for (int i =5;i<=num;i=i*i){
            res = res +Math.floor( num/i);
        }
        System.out.println(res);
    }
}
