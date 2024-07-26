package www.son.dao;

import java.util.List;
import www.son.vo.TravelVO;

public interface IF_TravelDAO {
	public void insert(TravelVO tvo) throws Exception;
	public List<TravelVO> allList() throws Exception;
	
}
