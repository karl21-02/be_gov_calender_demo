package gov_calendar.domain.dashBoard.Service;

import gov_calendar.domain.dashBoard.Entity.User;
import gov_calendar.domain.dashBoard.Repository.DashBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashBoardService {
    @Autowired
    private DashBoardRepository dashBoardRepository;

}
