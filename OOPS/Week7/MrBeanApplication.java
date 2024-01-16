import java.io.IOException;

public class MrBeanApplication {

    public static void main(String[] args) {
        MrBeanApplication mrBeanApp = new MrBeanApplication();

        mrBeanApp.handleArithmeticException();

        mrBeanApp.handleNullPointerException();

        mrBeanApp.handleArrayIndexOutOfBoundsException();

        try {
            mrBeanApp.handleIOException();
        } catch (IOException e) {
            System.out.println("IOException handled: " + e.getMessage());
        }
    }

    private void handleArithmeticException() {
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled: " + e.getMessage());
        }
    }

    private void handleNullPointerException() {
        try {
            String str = null;
            int length = str.length(); 
            System.out.println("Length: " + length); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: " + e.getMessage());
        }
    }

    private void handleArrayIndexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; 
            System.out.println("Value: " + value); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }

    private void handleIOException() throws IOException {
        throw new IOException("Simulated IOException");
    }
}

