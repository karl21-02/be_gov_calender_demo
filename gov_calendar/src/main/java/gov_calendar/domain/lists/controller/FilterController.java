package gov_calendar.domain.lists.controller;

import gov_calendar.domain.lists.dto.BusinessDto;
import gov_calendar.domain.lists.service.ListService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 테스트를 위한 클래스
 */
@RestController
@AllArgsConstructor
public class FilterController {

    @Autowired
    private final ListService listService;

    @PostMapping("/list")
    public String saveBusiness(@RequestBody BusinessDto businessDto) {
        listService.save_business(businessDto);
        return "";
    }
}
