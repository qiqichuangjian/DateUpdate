package xml;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @author : 张晋飞
 * date : 2019/3/6
 */
public class Demo01 {


    public static void main(String[] args)throws Exception {

        // 创建一个解析器
        SAXReader  reader = new SAXReader();
        Document document = reader.read(new File("E:\\JavaWeb\\day08\\资料\\课件\\student.xml"));
        // 在一个xml中只有一个最大的节点
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        getNode(rootElement);
    }

    public static void getNode(Element rootElement) {
        List<Element> elements = rootElement.elements();

        for (Element element:elements) {
            System.out.println(element.getName());
            List<Attribute> attributes = element.attributes();
            if(attributes.size()!=0) {
                Attribute id = attributes.get(0);
                System.out.println(id.getName());
                String val = element.attributeValue(id.getName());
                System.out.println(val);
            }

            String textTrim = element.getTextTrim();
            if(!StringUtils.isEmpty(textTrim)) {
                System.out.println(textTrim);
            }
            getNode(element);
        }
    }

}
