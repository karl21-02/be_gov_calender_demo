package gov_calendar.domain.global.security.controller;

import gov_calendar.domain.global.security.dto.JoinDTO;
import gov_calendar.domain.global.security.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * join 요청을 받는다
 */
@Controller
@ResponseBody
public class JoinController {
    private final JoinService joinService;
    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }
    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {
        joinService.joinProcess(joinDTO);
        return "ok";
    }
}
