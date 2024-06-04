package hello.servlet.domain.member;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    public void save()
    {
        //given
        Member member = new Member("Juseop", 23);

        //when
        memberRepository.save(member);
        Member findMember = memberRepository.findById(member.getId());

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

    @Test
    public void findAll(){
        //given 
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 21);

        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> result = memberRepository.findAll();

        //then
        Assertions.assertThat(result.size()).isEqualTo(2);
        Assertions.assertThat(result).contains(member1, member2); 
    }
}
