package com.geeksforless.tfedorenko.supplier.entity;


import com.geeksforless.tfedorenko.supplier.entity.type.DiseaseClass;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "diseases")
public class Disease extends BaseEntity{
    @Column(name="name", nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name="disease_class")
    private DiseaseClass diseaseClass;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "diseases")
    private Set<Drug> drugs;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disease disease = (Disease) o;
        return Objects.equals(getId(), disease.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public Disease (){
        super();
        this.drugs = new HashSet<>();
    }


}
