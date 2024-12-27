package gov_calendar.domain.global.security.repository;

import gov_calendar.domain.global.security.entity.RefreshEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshRepository extends JpaRepository<RefreshEntity, Long> {
    Boolean existsByRefresh(String refresh);

    void deleteByRefresh(String refresh);
}
