package stellarhalo.hellospring.repository;

import stellarhalo.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 저장
    Optional<Member> findById(Long id); //id로 찾기
    Optional<Member> findByName(String name); //name으로 찾기
    List<Member> findAll(); //회원 모두 반환

}
