package test01;

import com.alibaba.fastjson.JSONObject;

/**
 * @Acthor:孙琪; date:2019/3/6;
 */
public class jsonTest02 {
    static String str="{\"mname\":\"得到长生庙\",\"mage\":100,\"heShang\":[{\"hname\":\"小强\",\"hage\":23}, {\"hname\":\"三丰\",\"hage\":25}, {\"hname\":\"唐僧\",\"hage\":27}]}";
    public static void main(String[] args) {
        Miao miao = JSONObject.parseObject(str, Miao.class);
        System.out.println(miao);
    }
}
