package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.MemberDTO;

public class MemberDAO { //ȸ����DB�� ����
	Connection conn = null;
	
	public MemberDAO(){//����̹� �ε�
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("�ε� ����");
			getConnection();
		} catch (Exception e) {
			System.out.println("�ε����");
		}
	}//������ ����
	Connection getConnection() {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			conn=DriverManager.getConnection(url, "system", "1111");
			System.out.println("���Ἲ��");
			return conn;
		} catch (Exception e) {
			System.out.println("���� ����");
		}
		return null;
	}//getconnection()����

	public void insert(MemberDTO dto){
		//����ڰ� �Է��� add�� �޾ƿͼ� db�� �����Ѵ�
		if(getConnection() != null) {
			try {
				String sql = "insert into member values (?,?,?)";
				PreparedStatement psmt = null;
				psmt=conn.prepareStatement(sql);
				psmt.setString(1, dto.getId());
				psmt.setString(2, dto.getPw());
				psmt.setString(3, dto.getName());
				psmt.executeUpdate();
			} catch (Exception e) {
				System.out.println("�Է��۾����� ���� �߻�");
			}
		}
	}//insert()����
	
	public void update(String userId, String modPw, String modName) {
		//����ڰ� �Է��� mod�� �޾ƿͼ� db�� �����Ѵ� > ��������:�Ű����� or ���ϰ�
		if(getConnection() != null) {
			try {
				String sql="update member set pw=?, name=? where id=?";
				PreparedStatement psmt=null;
				psmt=conn.prepareStatement(sql);
				psmt.setString(1, modPw);
				psmt.setString(2, modName);
				psmt.setString(3, userId);
				psmt.executeUpdate();
			} catch (Exception e) {
				System.out.println("�����۾����� ���ܹ߻�");
			}
		}
	}//update()����
	
	public MemberDTO select(String selectId) {
		MemberDTO dto = null;
		if(getConnection() != null) {
			try {
				String sql="select * from member where id=?";
				PreparedStatement psmt = null;
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, selectId);
				
				ResultSet rs = null;
				rs=psmt.executeQuery();

				while(rs.next()) {
					String id = rs.getString("id");
					String pw = rs.getString("pw");
					String name = rs.getString("name");
					
					dto = new MemberDTO();
					dto.setId(id);
					dto.setPw(pw);
					dto.setName(name);
				}
				
			} catch (Exception e) {
				System.out.println("��ȸ�۾����� ���ܹ߻�");
				return null;
			}
		}
		return dto;
	}//select()����
	
}//Ŭ���� ����
