package com.ems.batch.services;

import com.ems.batch.models.Batch;

public interface BatchService {
    public Object getById(String id);

    Batch add(Batch batch);

    Batch update(Batch batch);
}
