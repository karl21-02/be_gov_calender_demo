package gov_calendar.domain.calendar.service;

import gov_calendar.domain.calendar.dto.ScheduleDto;
import gov_calendar.domain.calendar.entity.Schedule;
import gov_calendar.domain.calendar.repository.CalendarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalendarService {
    @Autowired
    private final CalendarRepository calendarRepository;

    /**
     * 캘린더 일정을 저장
     * @param scheduleDto 캘린더 일정
     */
    public void saveSchedule(ScheduleDto scheduleDto) {
        Schedule schedule = Schedule.builder()
                        .username(scheduleDto.getUsername())
                                .scheduleName(scheduleDto.getScheduleName())
                                        .build();
        calendarRepository.save(schedule);
    }
}
