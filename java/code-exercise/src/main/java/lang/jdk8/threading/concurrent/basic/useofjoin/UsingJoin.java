package lang.jdk8.threading.concurrent.basic.useofjoin;

public class UsingJoin {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Sleeper sleepy = new Sleeper("Sleepy", 1500), grumpy = new Sleeper("Grumpy", 1500);

        Joiner dopey = new Joiner("Dopey", sleepy), doc = new Joiner("Doc", grumpy);

    }
}
