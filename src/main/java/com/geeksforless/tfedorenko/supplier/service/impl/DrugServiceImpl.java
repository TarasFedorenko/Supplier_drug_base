package com.geeksforless.tfedorenko.supplier.service.impl;

import com.geeksforless.tfedorenko.supplier.dto.DrugQuantityDto;
import com.geeksforless.tfedorenko.supplier.repository.DrugRepository;
import com.geeksforless.tfedorenko.supplier.service.DrugService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DrugServiceImpl implements DrugService {

    private final DrugRepository drugRepository;
    @Override
    public List<DrugQuantityDto> findDrugByArticle(List<String> articleList) {
        return drugRepository.findDrugByArticle(articleList);
    }
}
