package Final;

public class FinalMethodExample {

    public final void printMessage() {
        System.out.println("This method cannot be overridden.");
    }
}

class Subclass extends FinalMethodExample {
    // Attempting to override a final method will result in a compilation error
    // public void printMessage() {
    //     System.out.println("This method cannot be overridden in the subclass.");
    // }
}
