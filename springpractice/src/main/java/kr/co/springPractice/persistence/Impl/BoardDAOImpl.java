package kr.co.springPractice.persistence.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.springPractice.domain.BoardDTO;
import kr.co.springPractice.persistence.IBoardDAO;


@Repository
public class BoardDAOImpl implements IBoardDAO{

	@Autowired
	private SqlSession session;
	
	@Override
	public void create(BoardDTO bDto) throws Exception {
		session.insert("BoardMapper.create", bDto);
		
	}

	@Override
	public BoardDTO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("BoardMapper.read", bno);
	}

	@Override
	public int update(BoardDTO bDto) throws Exception {
		// TODO Auto-generated method stub
		return session.update("BoardMapper.update", bDto);
	}

	@Override
	public int delete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return session.delete("BoardMapper.delete",bno);
	}
	
	@Override
	public List<BoardDTO> listAll() throws Exception {
		return session.selectList("BoardMapper.listAll");
	}

}
