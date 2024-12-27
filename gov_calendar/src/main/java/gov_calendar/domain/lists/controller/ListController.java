package gov_calendar.domain.lists.controller;

import gov_calendar.domain.lists.dto.BusinessDto;
import gov_calendar.domain.lists.service.ListService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 테스트용 클래스
 */
@Controller
@AllArgsConstructor
public class ListController {

    @Autowired
    private final ListService listService;

    /**
     * 지원사업 리스트 페이지 반환
     * @return
     */
    @GetMapping("/list")
    public String list() {
        return "/list";
    }

    /**
     * 지원 사업 리스트의 필터 요청
     * @param filters
     * @return
     */
    @GetMapping("/filters")
    public List<BusinessDto> business(@RequestParam(value = "business") String filters) {
        List<BusinessDto> list_business = listService.get_lists(filters);
        if(list_business.isEmpty()) {
            list_business.add(null);
        }
        return list_business;
    }

}
