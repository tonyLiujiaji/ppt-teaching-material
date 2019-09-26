package ptt.teaching.material.model.design;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author TonyLiu
 * @Date 2019/9/26
 * @Description: TODO
 * @Version V1.0
 **/
@Data
@Setter
@Getter
public class SingletonObject implements Serializable, Cloneable {
    private static final long serialVersionUID = -1513291121219872652L;

    private static SingletonObject instance;

    /**
     *  姓名
     */
    private String name;

    /**
     * 性别
     */
    private int sex;

    /**
     * 年龄
     */
    private int age;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 住址
     */
    private String address;

    /*private SingletonObject(String name, int sex, int age, String mobile, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
    }*/

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (null == instance)
            synchronized (SingletonObject.class) {
                if (null == instance)
                    instance = new SingletonObject();
            }
        return instance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
