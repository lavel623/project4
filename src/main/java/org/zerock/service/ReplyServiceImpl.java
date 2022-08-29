package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.ReplyMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ReplyServiceImpl  implements ReplyService{
	
	@Setter(onMethod_ = {@Autowired })
	private ReplyMapper mapper;
	// @AllArgsConstructor 어노테이션을 붙이고 @Setter 를 붙이지 않는 방법도 있다.
	// = (생성자 자동주입)
	
	@Override
	public int register(ReplyVO vo) {
		
		log.info("register....." + vo);
		
		return mapper.insert(vo);
	}
	
	@Override
	public ReplyVO get(Long rno) {
		
		log.info("get........" + rno);
		
		return mapper.read(rno);
	}
	
	@Override
	public int modify(ReplyVO vo) {
		
		log.info("modify...." + vo);
		
		return mapper.update(vo);
	}
	
	@Override
	public int remove(Long rno) {
		
		log.info("remove......" + rno);
		
		return mapper.delete(rno);
	}
	
	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		
		log.info("get Reply List of a Board " + bno);
		
		return mapper.getListWithPaging(cri, bno);
	}
}
