package demo03;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @Acthor:孙琪; date:2019/3/6;
 */
//使用反射技术完成Java代码
public class ClassPathXmlApplicationContext {
    private String pathXml = null;

    public ClassPathXmlApplicationContext(String pathXml) {
        this.pathXml = pathXml;
    }

    public Object getBean(String beanId) throws Exception {
        if (StringUtils.isEmpty(beanId)) {
            throw new Exception("beanId is null");
        }
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(this.getClass().getClassLoader().getResource(pathXml));
        // 获取到根节点
        Element rootElement = read.getRootElement();
        // 根节点下所有的子节点
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            // 获取到节点上的属性
            String id = element.attributeValue("id");
            if (StringUtils.isEmpty(id)) {
                continue;
            }
            if (!id.equals(beanId)) {
                continue;
            }

            // 使用java反射机制初始化对象
            String beanClass = element.attributeValue("class");
            Class<?> forName = Class.forName(beanClass);
            Object newInstance = forName.newInstance();
            List<Element> propertyElementList = element.elements();
            for (Element el : propertyElementList) {
                String name = el.attributeValue("name");
                String value = el.attributeValue("value");
                Field declaredField = forName.getDeclaredField(name);
                declaredField.setAccessible(true);
                declaredField.set(newInstance, value);
            }
            return newInstance;



        }
        return null;
    }

}
