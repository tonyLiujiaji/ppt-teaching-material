package ptt.teaching.material.design.pattern.Singleton;

import com.alibaba.fastjson.JSONObject;
import ptt.teaching.material.model.design.SingletonObject;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author TonyLiu
 * @Date 2019/9/26
 * @Description: TODO 单例模式-测试
 * @Version V1.0
 **/
public class SingletonTest {
    public void test() {
        SingletonObject singleObject = SingletonObject.getInstance();
        singleObject.setName("Tony.Liu");
        singleObject.setSex(1);
        singleObject.setAge(18);
        singleObject.setMobile("13636377588");
        singleObject.setAddress("中国央行");

        System.out.println(singleObject);
        System.out.println(SingletonObject.getInstance());

        SingletonObject singleObject1 = singleObject.getInstance();
        System.out.println(JSONObject.toJSONString(singleObject1));
        System.out.println(JSONObject.toJSONString(singleObject));
    }
}
