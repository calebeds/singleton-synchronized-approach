public class Singleton {
    // the private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;
    /*
    * The Singleton Constructor
    * Note that it is private!
    * No client can instantiate a Singleton object!
     */
    private Singleton() {}

    // by adding the synchronized keyword to the getInstance(),
    // we force every thread to wait its turn before it can enter the method
    public static synchronized Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}