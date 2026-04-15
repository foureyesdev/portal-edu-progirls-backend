package br.com.progirls.api.portal.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "areas")
@Getter
@Setter
@NoArgsConstructor
public class Area extends EntidadeBase {

    @Column(nullable = false, unique = true)
    private String nome;
}
