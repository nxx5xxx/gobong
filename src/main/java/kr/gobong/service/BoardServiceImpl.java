package kr.gobong.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.gobong.domain.BoardDTO;
import kr.gobong.repository.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private HttpServletRequest request;
	
	// 글 목록 보기 
	public List<BoardDTO> getBoardList(){
		List<BoardDTO> boardList = boardDAO.getBoardList();
		return boardList;
	}
	
	/* 이재호0718 */
	private String saveUploadFile(MultipartFile uploadFile) {
		 
		String fileName = System.currentTimeMillis() + "_" + uploadFile.getOriginalFilename();
		String rootPath = request.getSession().getServletContext().getRealPath("/") ;
		try {
			uploadFile.transferTo(new File(rootPath +"resources\\upload\\" + fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileName;
	}
	
	@Override
	public void boardInsert(BoardDTO boardDTO) {
		System.out.println("no" + boardDTO.getNo());
		System.out.println("content" + boardDTO.getContent());
		System.out.println("img1" + boardDTO.getImg1());
		MultipartFile upload_img1 = boardDTO.getUpload_img1();
		
		if(upload_img1.getSize()>0) {
			String fileName1 = saveUploadFile(upload_img1);
			boardDTO.setImg1(fileName1);
		}
		MultipartFile upload_img2 = boardDTO.getUpload_img2();
		if(upload_img2.getSize()>0) {
			String fileName2 = saveUploadFile(upload_img2);
			boardDTO.setImg2(fileName2);
		}
		MultipartFile upload_img3 = boardDTO.getUpload_img3();
		if(upload_img3.getSize()>0) {
			String fileName3 = saveUploadFile(upload_img3);
			boardDTO.setImg3(fileName3);
		} 
		boardDAO.boardInsert(boardDTO);
	}
	/*//이재호0718 */
}
