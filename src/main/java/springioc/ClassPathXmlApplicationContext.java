package springioc;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author : 张晋飞
 * date : 2019/3/6
 */
public class ClassPathXmlApplicationContext {


    private String pathUrl;

    public ClassPathXmlApplicationContext(String pathUrl){
        this.pathUrl=pathUrl;
    }

    public Object  getBean(String beanId)throws Exception{
        if(StringUtils.isEmpty(beanId)){
            System.err.println("beanId not is null ");
            return null;
        }

        SAXReader reader = new SAXReader();
        Document document = reader.read(this.getClass().getClassLoader().getResource(pathUrl));
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();

        for (Element element:elements) {

            String id = element.attributeValue("id");
           if(StringUtils.isEmpty(id)){
              continue;
           }
            if(!id.equals(beanId)){
                continue;
            }
            String clazz = element.attributeValue("class");
            if(StringUtils.isEmpty(clazz)){
                return null;
            }
            Class<?> forName = Class.forName(clazz);
            Object obj = forName.newInstance();
            Field[] fields = forName.getFields();
            List<Element> propertys = element.elements();
            for (Element property:propertys) {
                String name = property.attributeValue("name");
                Field[] declaredFields = forName.getDeclaredFields();
                for (Field field: declaredFields) {
                    if(name.equals(field.getName())){
                        String value = property.attributeValue("value");
                        field.setAccessible(true);
                        field.set(obj,value);
                    }
                }
            }
            return  obj;
        }
        return null;
    }

}
