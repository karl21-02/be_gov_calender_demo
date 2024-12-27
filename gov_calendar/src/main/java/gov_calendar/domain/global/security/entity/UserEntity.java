package gov_calendar.domain.global.security.entity;

import jakarta.persistence.*;
import lombok.*;

import java.beans.ConstructorProperties;

@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username; // 사용자 이름(아이디)
    private String password; // 사용자 패스워드
    private String role; // 사용자 역활
}
