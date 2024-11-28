package db_prac;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PreExamDAO {
    private static final String URL = "jdbc:h2:~/h2db/db_prac;Mode=PostgreSQL;AUTO_SERVER=TRUE";
    private static final String USER_NAME = "b2230380";
    private static final String USER_PASS = "b2230380";

    public List<PreExam> selectPreExams(int lessThan) throws SQLException {
        List<PreExam> returning = new ArrayList<>();
        String SQL = "SELECT * FROM 学生情報 WHERE 得点 <= ?";

        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, lessThan);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                String col1 = result.getString("学生コード");
                String col2 = "null";
                String col3 = "null";
                int coll4 = result.getInt("得点");
                PreExam preExam = new PreExam(col1, col2, col3, coll4);
                returning.add(preExam);
            }
        }
        return returning;
    }

    public int deletePreExam(String gakuskicode) throws SQLException {
        String sql = "DELETE FROM 学生情報 WHERE 学生コード = ?";
        int n = 0;
        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, gakuskicode);
            n = stmt.executeUpdate();
        }
        return n;
    }

    public int insertPreExam(String gakusekiCode, String familyName, String firstName, int point) throws SQLException {
        String sql = "INSERT INTO 学生情報(学生コード,氏,名,得点) VALUES(?,?,?,?)";
        int n = 0;
        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, gakusekiCode);
            stmt.setString(2, familyName);
            stmt.setString(3, firstName);
            stmt.setInt(4, point);
            n = stmt.executeUpdate();
        }
        return n;
    }
}
