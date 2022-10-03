package study.datajpa.dto;

import lombok.Data;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String userName, String teamName) {
        this.id = id;
        this.username = userName;
        this.teamName = teamName;
    }
}
