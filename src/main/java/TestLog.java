/**
 * Created by songxin07 on 17/6/23.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
    Logger log = LoggerFactory.getLogger(TestLog.class);
    public void test() {
        String str = "debugggg";
        log.info("hello, my name is {}", "chengyi");
        log.debug("this is a debug  msg={}",str);
        log.error("this is a error msg");
        log.warn("this is a warn");
    }
    public static void main(String[] args){
        TestLog testlog = new TestLog();
        testlog.test();
        System.out.println(TestLog.class.getName());
    }
}