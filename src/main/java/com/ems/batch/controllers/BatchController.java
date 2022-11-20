package com.ems.batch.controllers;

import com.ems.batch.models.Batch;
import com.ems.batch.services.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("batch")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @GetMapping("{id}")
    public Object getById(@PathVariable String id){
        return batchService.getById(id);
    }

    @PostMapping("add")
    public Batch add(@RequestBody Batch batch) {
        return batchService.add(batch);
    }

    @PutMapping("update")
    public Batch update(@RequestBody Batch batch) {
        return batchService.update(batch);
    }
}
