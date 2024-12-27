package gov_calendar.domain.lists.service;

import gov_calendar.domain.lists.dto.BusinessDto;
import gov_calendar.domain.lists.entity.Business;
import gov_calendar.domain.lists.repository.ListRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class ListService {

    @Autowired
    private final ListRepository listRepository;

    public List<BusinessDto> get_lists(String filters) {
        List<Business> list = listRepository.findAllByFilterNameContaining(filters);
        List<BusinessDto> listDto = new ArrayList<>();
        list.forEach(b -> listDto.add(BusinessDto.toDto(b)));
        return listDto;
    }

    public void save_business(BusinessDto businessDto) {
        Business business = Business.builder()
                        .businessName(businessDto.getBusinessName())
                        .filterName(businessDto.getFilterName())
                        .build();
        listRepository.save(business);
    }
}
