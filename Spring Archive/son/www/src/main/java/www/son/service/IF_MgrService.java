package www.son.service;

import java.util.List;
import www.son.vo.MgrVO;

public interface IF_MgrService {

	public void insert(MgrVO mvo) throws Exception;
	public List<MgrVO> allList() throws Exception;
	public void delete(String num) throws Exception;
	public MgrVO update(int num) throws Exception;
	public void updateSave(MgrVO mvo) throws Exception;
}
