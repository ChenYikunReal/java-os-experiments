/**
 * 测试类，可运行
 * @author BlankSpace
 */
public class Test {

    public static void main(String[] args) {
        OS os = new OS();
        os.register("Sam");
        os.register("Bob");
        os.register("Sam");
        os.register("Tom");
        os.login("Sam");
    }

}
