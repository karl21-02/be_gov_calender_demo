package gov_calendar.domain.calendar.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 캘린더에 표시하는 일정
 */
@Getter
@Setter
public class ScheduleDto {

    private String username; // 사용자 이름
    private String scheduleName; // 스케쥴 이름
}
