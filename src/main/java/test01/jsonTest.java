package test01;

/**
 * @Acthor:孙琪;
 * date:2019/3/6;
 */

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 从前有座山，山上有座庙，庙里有三个和尚。和尚的名字为：小强，三丰，唐僧 年龄都是90后
 * 这座庙有100年的历史了，庙的名字叫 得道长生庙
 * 要求：将庙作为一个对象，来将和尚的信息打印出来。
 *
 */
//封装json
public class jsonTest {
    public static void main(String[] args) {
        JSONArray array=new JSONArray();
        JSONObject heShang1=new JSONObject();
        heShang1.put("hname","小强");
        heShang1.put("hage",23);
        JSONObject heShang2=new JSONObject();
        heShang2.put("hname","三丰");
        heShang2.put("hage",25);
        JSONObject heShang3=new JSONObject();
        heShang3.put("hname","唐僧");
        heShang3.put("hage",27);
        array.add(heShang1);
        array.add(heShang2);
        array.add(heShang3);

        JSONObject jsonObject =  new JSONObject();
        jsonObject.put("mname","得道长生庙");
        jsonObject.put("mage",100);
        jsonObject.put("heShang",array);
        System.out.println(jsonObject);
    }

}
