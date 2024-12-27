package gov_calendar.domain.dashBoard.Repository;

import gov_calendar.domain.dashBoard.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashBoardRepository extends JpaRepository<User, Long> {
}
