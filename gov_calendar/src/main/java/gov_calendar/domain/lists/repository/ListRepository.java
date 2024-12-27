package gov_calendar.domain.lists.repository;

import gov_calendar.domain.lists.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListRepository extends JpaRepository<Business, Long> {
    List<Business> findAllByFilterNameContaining(String name);
}
