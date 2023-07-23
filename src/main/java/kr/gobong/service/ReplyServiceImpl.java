package kr.gobong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.gobong.domain.ReplyDTO;
import kr.gobong.repository.BoardDAO;
import kr.gobong.repository.ReplyDAO;


@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	ReplyDAO replyDAO;
	
	@Autowired
	BoardDAO boardDAO;


	
	//이재호0721
	@Override
	public void addReply(ReplyDTO replyDTO) {
		replyDAO.addReply(replyDTO);
	}

	@Override
	public void deleteReply(int rno) {
		replyDAO.deleteReply(rno);
	}

//이재호0721
}
