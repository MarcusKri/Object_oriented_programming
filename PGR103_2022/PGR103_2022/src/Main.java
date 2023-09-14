import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Program program = null;
        try {
            program = new Program();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert program != null;
            program.handleUserInteraction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
