public class finallyex {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("Result is" + c);
        } catch (Exception e) {
            System.out.println("Division by zero" + e);
        }
        finally{
            System.out.println("End of the program");
        }
    }
}
