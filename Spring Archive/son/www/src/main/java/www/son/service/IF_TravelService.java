package www.son.service;


import java.util.List;

import www.son.vo.TravelVO;

public interface IF_TravelService {
	public void insert(TravelVO tvo) throws Exception;
	public List<TravelVO> allList() throws Exception;
	
}
