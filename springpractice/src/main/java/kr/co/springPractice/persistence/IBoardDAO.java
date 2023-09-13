package kr.co.springPractice.persistence;

import java.util.List;

import kr.co.springPractice.domain.BoardDTO;

public interface IBoardDAO {
	public void create(BoardDTO bDto) throws Exception;
	public BoardDTO read(Integer bno) throws Exception;
	public int update(BoardDTO bDto) throws Exception;
	public int delete(Integer bno) throws Exception;
	public List<BoardDTO> listAll() throws Exception;
}
