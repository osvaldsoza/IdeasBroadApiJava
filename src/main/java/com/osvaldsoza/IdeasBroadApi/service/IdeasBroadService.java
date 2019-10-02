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

    @Autowired
    private IdeasBroad ideasBroad;

    public List<IdeasBroad> getAllIdeasBroad() {
        return repository.findAll(sortByIdAsc());
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.DESC, "created");
    }

    public IdeasBroad newIdea(IdeasBroad ideasBroad) {
        return repository.save(ideasBroad);
    }

    public void deleteIdea(IdeasBroad ideasBroad) {
        repository.delete(ideasBroad);
    }

}
