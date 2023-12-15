package com.geeksforless.tfedorenko.supplier.facade.impl;

import com.geeksforless.tfedorenko.supplier.dto.DrugQuantityDto;
import com.geeksforless.tfedorenko.supplier.facade.DrugFacade;
import com.geeksforless.tfedorenko.supplier.service.DrugService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DrugFacadeImpl implements DrugFacade {

    private final DrugService drugService;
    @Override
    public List<DrugQuantityDto> findDrugByArticle(String articleList) {
        List<String> articles = List.of(articleList.split(","));
        return drugService.findDrugByArticle(articles);
    }
}
