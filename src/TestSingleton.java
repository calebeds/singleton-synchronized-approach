public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        // set the data value
        s.setData(55);

        System.out.println("First Reference: " + s);
        System.out.println("Singleton Data Value Is: " + s.getData());

        // get another reference to the Singleton
        // It is the same object?

        s = null;
        s = Singleton.getInstance();

        System.out.println("\nSecond Reference: " + s);
        System.out.println("Singleton Data Values Is: " + s.getData());
    }
}
