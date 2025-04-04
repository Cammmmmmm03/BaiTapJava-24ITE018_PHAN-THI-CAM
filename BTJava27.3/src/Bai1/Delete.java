package Bai1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Delete {
    public static void main(String[] args) {
        try{
            File file = new File("D:/JAVA MUTIL THREADING/BTJava27.3/src/Bai1/data.xml");
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder= factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList nodeList = doc.getElementsByTagName("student");

            for(int i=0; i< nodeList.getLength();i++){
                Element student =(Element) nodeList.item(i);
                if(student.getAttribute("id").equals("2")){
                    student.getParentNode().removeChild(student);
                    break;
                }
            }
            TransformerFactory transformerFactory= TransformerFactory.newInstance();
            Transformer transformer= transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result= new StreamResult(new File ("D:/JAVA MUTIL THREADING/BTJava27.3/src/Bai1/data.xml"));
            transformer.transform(source, result);

            System.out.println("xóa sinh viên thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
