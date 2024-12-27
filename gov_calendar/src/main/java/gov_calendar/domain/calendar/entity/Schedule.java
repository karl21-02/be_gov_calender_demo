package gov_calendar.domain.calendar.entity;

import gov_calendar.domain.dashBoard.Entity.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username; // 사용자 이름

    @Column(name = "scheduleName")
    private String scheduleName; // 스케줄 이름
}
