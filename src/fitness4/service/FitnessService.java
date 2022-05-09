package fitness4.service;

import java.util.List;

import fitness4.FitnessVO;

public interface FitnessService {

    // 멤버 등록
    public int regist(FitnessVO vo);

    // 아이디로 멤버 조회
    public FitnessVO selectById(String usrid);

    // 전체 멤버 조회
    public List<FitnessVO> selectAll();

    // 멤버 삭제
    public int delete(String usrid);

    // 멤버 정보 수정
    public int update(FitnessVO vo);
}
