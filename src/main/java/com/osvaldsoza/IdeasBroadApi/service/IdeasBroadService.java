package com.osvaldsoza.IdeasBroadApi.service;

import com.osvaldsoza.IdeasBroadApi.models.IdeasBroad;
import com.osvaldsoza.IdeasBroadApi.repositories.IdeasBroadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeasBroadService {

    @Autowired
    private IdeasBroadRepository repository;

    public List<IdeasBroad> getAllIdeasBroad() {
        return repository.findAll();
    }

//    private Sort sortByIdAsc() {
//        return new Sort(Sort.Direction.DESC, "created");


    public List<IdeasBroad> getIdeasBroadOrderByIdDesc() {
        return repository.findAllIdeasOrderByIdDesc();
    }

    public IdeasBroad newIdea(IdeasBroad ideasBroad) {
        return repository.save(ideasBroad);
    }

    public void deleteIdea(IdeasBroad ideasBroad) {
        repository.delete(ideasBroad);
    }
}
