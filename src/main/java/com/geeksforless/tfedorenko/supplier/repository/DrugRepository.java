package com.geeksforless.tfedorenko.supplier.repository;


import com.geeksforless.tfedorenko.supplier.dto.DrugQuantityDto;
import com.geeksforless.tfedorenko.supplier.entity.Drug;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DrugRepository extends BaseRepository<Drug>{

    @Query("select new com.geeksforless.tfedorenko.supplier.dto.DrugQuantityDto(d.article, d.quantity) from Drug d where d.article in :articleList")
    List<DrugQuantityDto> findDrugByArticle(@Param("articleList") List<String> articleList);
}
