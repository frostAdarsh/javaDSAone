public class MethodLearn {
    public static void main(String[] args) {
//        greet();
//        average(6,5, true);
    }

    static void greet() {
        System.out.println("Hello, World!");
    }

    public static void  average(int a,int b ,boolean done) {
        if(done){
            int avg = (a+b)/2;
            System.out.println("the avg is " +  avg);
        }
        else {
            System.out.println("not done");
        }
    }
}
