import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test {
	public static void main(String[] args) {
		Logger log =LoggerFactory.getLogger(test.class);
		log.debug("debug消息id={},name={}",1,"张三");
		log.info("普通消息");
	}
}
