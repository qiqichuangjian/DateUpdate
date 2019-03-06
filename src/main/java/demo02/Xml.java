package demo02;


import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * @Acthor:孙琪; date:2019/3/6;
 */
public class Xml {
    public static void main(String[] args) throws Exception{
        // 创建一个解析器
        SAXReader reader = new SAXReader();
        //读取文件 转换成Document
        Document document = reader.read(new File("F:\\LianXi\\student.xml"));
        // 在一个xml中只有一个最大的节点
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
        getNode(rootElement);
    }

    private static void getNode(Element rootElement) {
        List<Element> elements = rootElement.elements();
        for (Element element:elements) {
            System.out.println(element.getName());
            //属性attributes
            List<Attribute> attributes = element.attributes();
            if(attributes.size()!=0) {
                Attribute shuxing = attributes.get(0);//得到索引号为0的属性名和值
                Attribute shuxing1 = attributes.get(1);//得到索引号为1的属性名和值
                System.out.println(shuxing.getName());
                String val = element.attributeValue(shuxing.getName());
                System.out.println(val);
            }
            //得到标签中的文本信息，文本不为空时打印信息
            String textTrim = element.getTextTrim();
            if(!StringUtils.isEmpty(textTrim)) {
                System.out.println(textTrim);
            }
            //递归，使其得到所有节点信息
            getNode(element);
        }
    }
}
