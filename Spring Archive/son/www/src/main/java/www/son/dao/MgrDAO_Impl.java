package www.son.dao;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import www.son.vo.MgrVO;


@Repository
public class MgrDAO_Impl implements IF_MgrDAO{
	
	private static String mapperQuery="www.son.dao.IF_MgrDAO";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public void insert(MgrVO mvo) throws Exception {
		sqlSession.insert(mapperQuery+".insert", mvo);
	}
	@Override
	public List<MgrVO> allList() throws Exception {
		return sqlSession.selectList(mapperQuery+".selectall");
	}
	@Override
	public void delete(String num) throws Exception {
		sqlSession.delete(mapperQuery+".delete", num);
	}
	@Override
	public MgrVO update(int num) throws Exception {
		return sqlSession.selectOne(mapperQuery+".selectone", num);
	}
	@Override
	public void updateSave(MgrVO mvo) throws Exception {
		sqlSession.update(mapperQuery+".update", mvo);
	}
}
