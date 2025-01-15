public class trycatch {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("Result is" + c);
        } catch (Exception e) {
            System.out.println("Division by zero" + e);
        }
    }
}
