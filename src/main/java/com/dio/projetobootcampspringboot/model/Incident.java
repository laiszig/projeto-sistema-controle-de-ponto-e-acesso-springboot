package com.dio.projetobootcampspringboot.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Incident {
    @Id
    private long id;
    private String name;
    private String description;
}
