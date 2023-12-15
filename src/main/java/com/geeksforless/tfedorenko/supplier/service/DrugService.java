package com.geeksforless.tfedorenko.supplier.service;

import com.geeksforless.tfedorenko.supplier.dto.DrugQuantityDto;

import java.util.List;

public interface DrugService {

    List<DrugQuantityDto> findDrugByArticle(List<String> isbnList);
}
