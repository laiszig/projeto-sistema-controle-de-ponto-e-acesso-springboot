package com.dio.projetobootcampspringboot.controller;

import com.dio.projetobootcampspringboot.Service.WorkHoursService;
import com.dio.projetobootcampspringboot.model.WorkHours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workHours")
public class WorkHoursController {
    @Autowired
    WorkHoursService workHoursService;

    @PostMapping
    public WorkHours createWorkHours(@RequestBody WorkHours workHours) {
        return workHoursService.saveWorkHours(workHours);
    }

    @GetMapping
    public List<WorkHours> getWorkHoursList() {
        return workHoursService.findAll();
    }

    @GetMapping("/{workHoursId}")
    public ResponseEntity<WorkHours> getWorkHoursById(@PathVariable("workHoursId") Long workHoursId) throws Exception {
        return ResponseEntity.ok(workHoursService.getById(workHoursId).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @PutMapping
    public WorkHours updateWorkHours(@RequestBody WorkHours workHours) {
        return workHoursService.updateWorkHours(workHours);
    }

    @DeleteMapping("/{workHoursId}")
    public ResponseEntity<WorkHours> deleteById(@PathVariable("workHoursId") Long workHoursId) throws Exception {
        try {
            workHoursService.deleteWorkHours(workHoursId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkHours>) ResponseEntity.ok();
    }
}