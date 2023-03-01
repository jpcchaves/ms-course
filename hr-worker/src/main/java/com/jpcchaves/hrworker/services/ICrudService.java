package com.jpcchaves.hrworker.services;

import java.util.List;

public interface ICrudService<Req, Res> {

    List<Res> findAll();
    Res findById(Long id);

    Res create(Req entity);
    Res update(Long id, Req entity);
    void delete(Long id);
}
