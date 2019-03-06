package json;

import com.alibaba.fastjson.JSONObject;

/**
 * @author : 张晋飞
 * date : 2019/3/6
 */
public class Demo02 {

    static String str="{\"id\": \"001\",\"name\": \"zhangsan\",\"project\": [{\"pId\": \"01\",\"pName\": \"chinese\"}, {\"pId\": \"02\",\"pName\": \"english\"}]}";

    public static void main(String[] args) {

        Person person = JSONObject.parseObject(str, Person.class);

        System.out.println(person);
    }

}
