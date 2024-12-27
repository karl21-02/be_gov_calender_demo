package gov_calendar.domain.calendar.repository;

import gov_calendar.domain.calendar.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Schedule, Long> {
}
