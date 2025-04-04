import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(String name, int age, double gpa) {
        String email = generateEmail(name);
        String query = "INSERT INTO Student (name, age, email, gpa) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, email);
            stmt.setDouble(4, gpa);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getAllStudents() {
        List<String> students = new ArrayList<>();
        String query = "SELECT * FROM Student";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                students.add(rs.getInt("StudentID") + " - " + rs.getString("name") + " - " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    private String generateEmail(String name) {
        return name.replaceAll(" ", "").toLowerCase() + "@vku.udn.vn";
    }
}
