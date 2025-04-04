package Bai1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Write {
    public static void main(String[] args) {
        try{
            File file = new File("D:/JAVA MUTIL THREADING/BTJava27.3/src/Bai1/data.xml");
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder= factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            Element root = doc.getDocumentElement();

            Element student = doc.createElement("student");
            student.setAttribute("id","3");

            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode("Châu Thị Ngọc Nữ"));

            Element age = doc.createElement("age");
            age.appendChild(doc.createTextNode("18"));

            student.appendChild(name);
            student.appendChild(age);
            root.appendChild(student);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer= transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            DOMSource source= new DOMSource(doc);
            StreamResult result= new StreamResult(new File("data.xml"));
            transformer.transform(source,result);

            System.out.println("thêm sinh viên thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
