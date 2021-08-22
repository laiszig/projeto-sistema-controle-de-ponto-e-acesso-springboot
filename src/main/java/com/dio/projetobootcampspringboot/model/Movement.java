package com.dio.projetobootcampspringboot.model;

import lombok.*;

import javax.persistence.*;
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
public class Movement {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public class MovementId implements Serializable {
            private long movementId;
            private long userId;
        }
        @Id
        @EmbeddedId
        private MovementId id;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private BigDecimal period;
        @ManyToOne
        private Incident incident;
        @ManyToOne
        private Calendar calendar;
}
