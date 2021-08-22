package com.dio.projetobootcampspringboot.Service;

import com.dio.projetobootcampspringboot.Repository.WorkHoursRepository;
import com.dio.projetobootcampspringboot.model.WorkHours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkHoursService {


    WorkHoursRepository workHoursRepository;

    @Autowired
    public WorkHoursService(WorkHoursRepository workHoursRepository) {
        this.workHoursRepository = workHoursRepository;
    }

    public WorkHours saveWorkHours (WorkHours workHours) {
        return workHoursRepository.save(workHours);
    }

    public List<WorkHours> findAll() {
        return workHoursRepository.findAll();
    }

    public Optional<WorkHours> getById(Long workHoursId) {
        return workHoursRepository.findById(workHoursId);
    }

    public WorkHours updateWorkHours (WorkHours workHours) {
        return workHoursRepository.save(workHours);
    }

    public void deleteWorkHours (Long workHoursId) {
        workHoursRepository.deleteById(workHoursId);
    }
}
