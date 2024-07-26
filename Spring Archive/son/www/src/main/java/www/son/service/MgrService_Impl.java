package www.son.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import www.son.dao.IF_MgrDAO;
import www.son.vo.MgrVO;

@Service
public class MgrService_Impl implements IF_MgrService {

	@Inject
	IF_MgrDAO mdao;

	@Override
	public void insert(MgrVO mvo) throws Exception {
		mdao.insert(mvo);
	}
	
	@Override
	public List<MgrVO> allList() throws Exception {
		return mdao.allList();
	}

	@Override
	public void delete(String num) throws Exception {
		mdao.delete(num);
		
	}

	@Override
	public MgrVO update(int num) throws Exception {
		return mdao.update(num);
	}

	@Override
	public void updateSave(MgrVO mvo) throws Exception {
		mdao.updateSave(mvo);
	}
}
