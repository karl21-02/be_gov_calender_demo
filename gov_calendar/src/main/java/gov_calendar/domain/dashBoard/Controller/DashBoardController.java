package gov_calendar.domain.dashBoard.Controller;

import gov_calendar.domain.dashBoard.Entity.User;
import gov_calendar.domain.dashBoard.Service.DashBoardService;
import gov_calendar.domain.dashBoard.form.UserForm;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.DocFlavor;

@Controller
@RequestMapping("/list")
@AllArgsConstructor
public class DashBoardController {

    @Autowired
    private final DashBoardService dashBoardService;

    /**
     * 메인 페이지 반환
     * @return
     */
    @GetMapping("/dashboard")
    public String dash_board() {
        return "/dashboard";
    }

    /**
     * 테스트를 위한 클래스 -> templates -> dashboard.html에 있는 form에 name만 있음.
     * @param userForm
     * @return
     */
    @PostMapping("/name")
    public String save_name(UserForm userForm) {
        User user = userForm.GetUser();
        return "dashboard";
    }
}
