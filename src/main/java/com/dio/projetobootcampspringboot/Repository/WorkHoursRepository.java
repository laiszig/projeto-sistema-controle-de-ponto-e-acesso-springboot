package com.dio.projetobootcampspringboot.Repository;

import com.dio.projetobootcampspringboot.model.WorkHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkHoursRepository extends JpaRepository<WorkHours, Long> {
}
