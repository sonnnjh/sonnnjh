package www.son.service;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;
import www.son.dao.IF_TravelDAO;
import www.son.vo.TravelVO;

@Service
public class TravelService_Impl implements IF_TravelService{
	
	@Inject
	IF_TravelDAO tdao;
	
	@Override
	public void insert(TravelVO tvo) throws Exception {
		tdao.insert(tvo);
	}

	@Override
	public List<TravelVO> allList() throws Exception {
		return tdao.allList();
	}
	
}
