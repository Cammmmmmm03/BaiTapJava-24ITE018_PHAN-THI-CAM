package Bai1;
import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.File;

public class Read {
    public static void main(String[] args) {
        try{
            File file= new File("D:/JAVA MUTIL THREADING/BTJava27.3/src/Bai1/data.xml");
            if(!file.exists()){
                System.out.println("flie không tồn tại:"+file.getAbsolutePath());
                return ;
            }
            DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("student");

            System.out.println("Danh sách sinh viên :");
            for(int i=0; i< nodeList.getLength();i++){
                Node node = nodeList.item(i);
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    String id = element.getAttribute("id");
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String age = element.getElementsByTagName("age").item(0).getTextContent();
                    System.out.println("ID:"+ id+", Name:"+name+",Age:"+age);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
