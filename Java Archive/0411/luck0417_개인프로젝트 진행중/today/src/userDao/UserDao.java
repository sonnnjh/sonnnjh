package userDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import main.Dto;
import user.JoinDto;

public class UserDao {
	Connection conn = null;
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public UserDao(){
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("�ε� ����");
			getConnection();
		} catch (Exception e) {
			System.out.println("�ε� ����");
		}
	}
	public Connection getConnection() {
		try {
			conn=DriverManager.getConnection(url, "system", "1111");
			System.out.println("���Ἲ��");
			return conn;
		} catch (Exception e) {
			System.out.println("�������");
		}
		return null;
	}
	public void insert(JoinDto jd) {
		PreparedStatement psmt = null;
		if(getConnection() != null) {
			try {
				String sql = "insert into member values (?,?,?,?)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, jd.getId());
				psmt.setString(2, jd.getPw());
				psmt.setString(3, jd.getName());
				psmt.setString(4, jd.getBirth());
				int a = psmt.executeUpdate();
				System.out.println(a+"�� ����");
			} catch (Exception e) {
				System.out.println("�Է��۾����� ���ܹ߻�");
			}
		}
	}//insert()����
	public JoinDto selectUser(String id, String pw){
		PreparedStatement psmt = null;
		ResultSet rs = null;
		JoinDto dto = new JoinDto();
		if(getConnection() != null) {
			try {
				String sql = "select * from member where id=? and pw=?";
				psmt = conn.prepareStatement(sql);//������ ����
				rs=psmt.executeQuery();
				psmt.setString(1, id);
				psmt.setString(2, pw);
				String userid=rs.getNString("id");
				String userpw=rs.getString("pw");
//				JoinDto dto = new JoinDto();
				dto.setId(id);
				dto.setPw(pw);
			}catch (Exception e) {
				System.out.println("ȸ����ȸ �۾����� ���ܹ߻�");
			}
		}
		return dto;
	}
	
	
}//class����


