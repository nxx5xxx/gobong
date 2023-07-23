package kr.gobong.repository;

import java.util.List;

import kr.gobong.domain.ReplyDTO;

public interface ReplyDAO {

	
	//이재호0721
	//댓글 쓰기
	public void addReply(ReplyDTO replyDto);
	
	//댓글 삭제
	public void deleteReply(int rno);


	
}
