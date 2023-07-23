package kr.gobong.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.gobong.domain.ReplyDTO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Autowired
	public SqlSessionTemplate sqlSessionTemplate;


	
	// 이재호0721
	// 댓글 쓰기
	@Override
	public void addReply(ReplyDTO replyDto) {
		sqlSessionTemplate.insert("reply.addReply", replyDto);
	}
	// 댓글 삭제
	@Override
	public void deleteReply(int rno) {
		sqlSessionTemplate.delete("reply.deleteReply", rno);

	}


}
