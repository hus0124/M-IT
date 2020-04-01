package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
		
	@Test // BoardService Å×½ºÆ®
	public void testExist() {
		log.info(service);
		assertNotNull(service); //Junit Á¦°ø ¸Þ¼Òµå. Null °ªÀÎÁö ÆÇº°
	}
	
	@Test
	public void testGetList() {
		Criteria cri = new Criteria();
		service.getList(cri);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("Áý¿¡°¡°í½Í´Ù");
		board.setContent("³Ã¹«");
		board.setWriter("³ªºñ¿Ë");
		service.register(board);
	}
	
	@Test
	public void testGetRead() {
		service.get(4L);
	}
	
	@Test
	public void testModify() {
		BoardVO board = new BoardVO();
		board.setBno(16L);
		board.setTitle("Àú³á¸Þ´º¹¹ÀÓ?");
		board.setContent("Áa¹°¤»•ººö¤»");
		board.setWriter("¹Ò¹Ì¹Ò");
		service.modify(board);
	}
	
	@Test
	public void testRemove() {
		service.remove(15L);
	}
}
