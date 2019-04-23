package thread;

/**
 * Created by may on 2019/4/8.
 */
public class TestThreadPool {

    public static int a;
    public static void main(String[] args) {
        add();

        System.out.println(a);
    }

    public static synchronized void add(){
        a++;
    }

}
