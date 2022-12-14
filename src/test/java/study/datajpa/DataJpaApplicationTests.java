package study.datajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.entity.Member;
import study.datajpa.repository.MemberJpaRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class DataJpaApplicationTests {

	@Autowired
	MemberJpaRepository memberJpaRepository;

	@Test
	public void testMember() {
		Member member = new Member("memberA");
		Member savedMamber = memberJpaRepository.save(member);

		Member findMember = memberJpaRepository.find(savedMamber.getId());

		assertThat(findMember.getId()).isEqualTo(member.getId());
		assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
		assertThat(findMember).isEqualTo(member);
	}
}