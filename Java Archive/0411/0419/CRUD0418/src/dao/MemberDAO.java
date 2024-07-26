package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.MemberDTO;

public class MemberDAO { //회원을DB에 연동
	Connection conn = null;
	
	public MemberDAO(){//드라이버 로드
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("로드 성공");
			getConnection();
		} catch (Exception e) {
			System.out.println("로드실패");
		}
	}//생성자 종료
	Connection getConnection() {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			conn=DriverManager.getConnection(url, "system", "1111");
			System.out.println("연결성공");
			return conn;
		} catch (Exception e) {
			System.out.println("연결 실패");
		}
		return null;
	}//getconnection()종료

	public void insert(MemberDTO dto){
		//사용자가 입력한 add를 받아와서 db에 전송한다
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
				System.out.println("입력작업에서 예외 발생");
			}
		}
	}//insert()종료
	
	public void update(String userId, String modPw, String modName) {
		//사용자가 입력한 mod를 받아와서 db에 전송한다 > 수정사항:매개변수 or 리턴값
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
				System.out.println("수정작업에서 예외발생");
			}
		}
	}//update()종료
	
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
				System.out.println("조회작업에서 예외발생");
				return null;
			}
		}
		return dto;
	}//select()종료
	
}//클래스 종료
