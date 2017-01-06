import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println("Test Gradle project");
        System.out.println("New feature!");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
