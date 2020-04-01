package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class) //테스트코드가 스프링 실행역할
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	@Setter(onMethod_ = @Autowired)
	private DataSource dataSource;	//의존성 주입. root context xml에서 설정한 객체 주입, 생성. 
		
	@Test
	public void testConnection() {
		
		try {
			Connection conn = dataSource.getConnection();
			log.info(conn);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
	@Setter(onMethod_ = @Autowired)
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testMyBatis() {
		try {
			SqlSession session = sqlSessionFactory.openSession();
			Connection conn = session.getConnection();
			log.info(session);
			log.info(conn);			
		} catch(Exception e) {
			fail(e.getMessage());
		}
		
	}
}
