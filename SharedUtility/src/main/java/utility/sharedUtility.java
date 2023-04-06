package utility;

public class sharedUtility {

    // 在这个module里   我们可以写一些  其他module都会用到的代码块 / 类 等等.  这有别于 root pom下的 共同依赖jar包
    public static void printShare(){
        System.out.println("print sharedUtility");
    }
}
