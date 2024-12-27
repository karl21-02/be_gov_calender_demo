package gov_calendar.domain.lists.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "business")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String businessName; // 스케줄 이름
    private String filterName; // 필터 명

    @CreatedDate
    private LocalDateTime createdDate; // 사업이 생성된 시간

    @LastModifiedDate
    private LocalDateTime modifiedDate; // 사업을 수정한 시간
}
