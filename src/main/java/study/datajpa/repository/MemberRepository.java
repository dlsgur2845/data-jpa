package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    List<Member> findTop3HelloBy();

    /**
     * 쿼리 길어지면 함수명이 길어지니까 namedQuery 사용, APP 실행시 오타 있으면 오류 출력
     * 실무에서 namedQuery 잘안쓰고 repository에 바로 query 칠 수 있는 기능 사용
     */
    @Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);
}
