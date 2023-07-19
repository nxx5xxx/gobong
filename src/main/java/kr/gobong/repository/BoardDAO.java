package kr.gobong.repository;

import java.util.List;

import kr.gobong.domain.BoardDTO;

public interface BoardDAO {

	//전재영 글 목록 보기 
	public List<BoardDTO> getBoardList();
	//이재호 글쓰기
	public void boardInsert(BoardDTO boardDTO);
	
	//조태정 글삭제
	public void boardDel(int no);
	//조태정 친구 게시글 목록 보기
	public List<BoardDTO> getFriendBoardList(String id);
	
	//전재영 
	//글 상세보기
	public BoardDTO getBoardDetail(int no);
	
	//전재영 
	//글 수정하기
	public void boardEdit(BoardDTO boardDTO);
}
