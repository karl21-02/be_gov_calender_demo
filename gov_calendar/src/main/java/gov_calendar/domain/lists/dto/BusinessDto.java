package gov_calendar.domain.lists.dto;

import gov_calendar.domain.lists.entity.Business;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@AllArgsConstructor
public class BusinessDto {
    private String businessName; // 스케줄 이름
    private String filterName; // 필터 명

    public static BusinessDto toDto(Business business) {
        return new BusinessDto(
                business.getBusinessName(),
                business.getFilterName()
        );
    }
}
