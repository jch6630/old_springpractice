package kr.co.springPractice.service;

import java.util.List;

import kr.co.springPractice.domain.BoardDTO;

public interface IBoardService {
	
	public void register(BoardDTO bDto) throws Exception;
	public BoardDTO read(Integer bno) throws Exception;
	public boolean modify(BoardDTO bDto) throws Exception;
	public boolean remove(Integer bno) throws Exception;
	public List<BoardDTO> listAll() throws Exception;
	
}
