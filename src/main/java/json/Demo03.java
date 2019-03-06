package json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author : 张晋飞
 * date : 2019/3/6
 */
public class Demo03 {

    public static void main(String[] args) {

        JSONArray array =  new JSONArray();
        JSONObject project1 =  new JSONObject();
        project1.put("pId","01");
        project1.put("pName","chinese");

        JSONObject project2 =  new JSONObject();
        project2.put("pId","01");
        project2.put("pName","chinese");
        array.add(project1);
        array.add(project2);

        JSONObject jsonObject =  new JSONObject();
        jsonObject.put("id","001");
        jsonObject.put("name","张三");
        jsonObject.put("project",array);

        System.out.println(jsonObject);

        /**
         * 从前有座山，山上有座庙，庙里有三个和尚。和尚的名字为：小强，三丰，唐僧 年龄都是90后
         * 这座庙有100年的历史了，庙的名字叫 得道长生庙
         * 要求：将庙作为一个对象，来将和尚的信息打印出来。
         *
         */


    }
}
