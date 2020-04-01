package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Service
@Log4j
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;	// ������ 4.3 �̻󿡼� �ڵ� ó��. new �� ������ �� �ʿ� ����.
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("�۸�� ��������");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public void register(BoardVO board) {
		log.info("�۵�� ��" + board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("���ϳ� �������� : " + bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("�� �����ϱ�" + board);
		/* int i = mapper.update(board);
		if (i==1) 
			return true;
		else 
			return false; */
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("�� ���� �� ��ȣ : " + bno);
		return mapper.delete(bno)==1;
	}

}
