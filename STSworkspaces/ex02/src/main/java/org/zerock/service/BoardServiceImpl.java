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
	
	private BoardMapper mapper;	// 스프링 4.3 이상에서 자동 처리. new 로 생성자 쓸 필요 없다.
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("글목록 가져오기");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public void register(BoardVO board) {
		log.info("글등록 중" + board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("글하나 가져오기 : " + bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("글 수정하기" + board);
		/* int i = mapper.update(board);
		if (i==1) 
			return true;
		else 
			return false; */
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("글 삭제 글 번호 : " + bno);
		return mapper.delete(bno)==1;
	}

}
