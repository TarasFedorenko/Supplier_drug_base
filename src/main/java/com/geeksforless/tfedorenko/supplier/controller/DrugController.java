package com.geeksforless.tfedorenko.supplier.controller;

import com.geeksforless.tfedorenko.supplier.dto.DrugQuantityDto;
import com.geeksforless.tfedorenko.supplier.facade.DrugFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
@RequiredArgsConstructor
public class DrugController {

    private final DrugFacade drugFacade;

    @GetMapping
    public ResponseEntity<List<DrugQuantityDto>> findAllDrugs(@RequestParam(name = "article") String articleList ){
        return ResponseEntity.ok(drugFacade.findDrugByArticle(articleList));
    }
}
