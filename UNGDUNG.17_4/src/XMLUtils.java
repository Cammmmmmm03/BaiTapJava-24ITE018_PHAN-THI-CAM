package util;

import model.User;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XMLUtils {
    public static void exportUsers(List<User> users, String filePath) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.newDocument();
        Element root = doc.createElement("users");
        doc.appendChild(root);

        for (User u : users) {
            Element userElem = doc.createElement("user");

            Element username = doc.createElement("username");
            username.setTextContent(u.getUsername());
            userElem.appendChild(username);

            Element email = doc.createElement("email");
            email.setTextContent(u.getEmail());
            userElem.appendChild(email);

            // Không ghi hashed password
            root.appendChild(userElem);
        }

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filePath));
        transformer.transform(source, result);
    }

    public static List<User> importUsers(String filePath) throws Exception {
        List<User> users = new ArrayList<>();

        File file = new File(filePath);
        if (!file.exists()) throw new FileNotFoundException("File không tồn tại!");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);

        NodeList list = doc.getElementsByTagName("user");
        for (int i = 0; i < list.getLength(); i++) {
            Element userElem = (Element) list.item(i);
            String username = userElem.getElementsByTagName("username").item(0).getTextContent();
            String email = userElem.getElementsByTagName("email").item(0).getTextContent();

            // Do không có hashedPassword trong XML, bạn có thể gán rỗng hoặc default
            users.add(new User(username, email, ""));
        }

        return users;
    }
}
