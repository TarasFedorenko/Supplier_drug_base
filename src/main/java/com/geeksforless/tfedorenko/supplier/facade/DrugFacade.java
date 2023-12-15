package com.geeksforless.tfedorenko.supplier.facade;

import com.geeksforless.tfedorenko.supplier.dto.DrugQuantityDto;

import java.util.List;

public interface DrugFacade {

    List<DrugQuantityDto> findDrugByArticle(String articleList);
}
