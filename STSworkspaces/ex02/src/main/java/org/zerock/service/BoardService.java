package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	
	//1. ��Ϻ���
	public List<BoardVO> getList(Criteria cri);
	
	//2. �Խñ۵��
	public void register(BoardVO board);
	
	//3. �Խñۺ���
	public BoardVO get(Long bno);
	
	//4. �Խñۼ���
	public boolean modify(BoardVO board);
	
	//5. �Խñۻ���
	public boolean remove(Long bno);
	
	
}