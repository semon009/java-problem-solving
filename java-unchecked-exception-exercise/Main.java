class UncheckedException extends RuntimeException {
    public UncheckedException() {
        // No-argument constructor
    }
}

// Main class to test the solution
public class Main {
    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        System.out.println(uncheckedException instanceof RuntimeException); 
    }
}
