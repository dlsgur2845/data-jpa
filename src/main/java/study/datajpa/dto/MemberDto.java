package study.datajpa.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import study.datajpa.entity.Member;

@Schema(hidden = true)
@Data
public class MemberDto {

    private Long id;
    @Schema(description = "맴버 이름", example = "홍길동")
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    public MemberDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
    }
}
