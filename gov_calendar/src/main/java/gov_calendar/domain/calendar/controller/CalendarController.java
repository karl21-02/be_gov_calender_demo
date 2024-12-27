package gov_calendar.domain.calendar.controller;

import gov_calendar.domain.calendar.dto.ScheduleDto;
import gov_calendar.domain.calendar.entity.Schedule;
import gov_calendar.domain.calendar.service.CalendarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class CalendarController {

    @Autowired
    private final CalendarService calendarService;

    /**
     * 캘린더 메인 페이지 반환 함수
     * @return
     */
    @GetMapping("/calendar")
    public String main() {
        return "/calendar";
    }

    /**
     * 캘린더에 일정을 저장하는 함수
     * @param scheduleDto 캘린더에 올리는 일정 DTO
     */
    @PutMapping("/schedule")
    public void schedule(@RequestBody ScheduleDto scheduleDto) {
        calendarService.saveSchedule(scheduleDto);
    }
}
