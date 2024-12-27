package gov_calendar.domain.global.security.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDTO {

    private String username; // 사용자 이름(아이디에 해당)
    private String password; // 패스워드
}
