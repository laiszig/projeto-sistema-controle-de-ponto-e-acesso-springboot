package com.dio.projetobootcampspringboot.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CompTime {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class CompTimeId implements Serializable {
        private long compTimeId;
        private long movementId;
        private long userId;
    }
    @EmbeddedId
    private CompTimeId id;
    private LocalDateTime workedDate;
    private BigDecimal numberOfHours;
    private BigDecimal totalWorkedHours;


}
