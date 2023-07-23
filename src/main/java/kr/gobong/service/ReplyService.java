package kr.gobong.service;

import java.util.List;

import kr.gobong.domain.ReplyDTO;

public interface ReplyService {


	// 이재호0721
	// 댓글 쓰기
	public void addReply(ReplyDTO replyDTO);

	// 댓글 삭제
	public void deleteReply(int rno);

}
