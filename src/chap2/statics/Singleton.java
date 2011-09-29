package chap2.statics;

public class Singleton {
    private static Singleton _instance;

    private Singleton() {  }

    public static synchronized Singleton getInstance() {
            if (null == _instance) {
                    _instance = new Singleton();
            }
            return _instance;
    }
}