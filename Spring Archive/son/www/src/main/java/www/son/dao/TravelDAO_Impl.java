package www.son.dao;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import www.son.vo.TravelVO;

@Repository
public class TravelDAO_Impl implements IF_TravelDAO{
	@Inject
	private SqlSession sqlsession;
	
	private static String mapperQuery = "www.son.dao.IF_TravelDAO";
	
	
	@Override
	public void insert(TravelVO tvo) throws Exception {
		sqlsession.insert(mapperQuery+".insert", tvo);
		
	}


	@Override
	public List<TravelVO> allList() throws Exception {
		return sqlsession.selectList(mapperQuery+".allList");
	}

}
