package com.osvaldsoza.IdeasBroadApi.resources;

import com.osvaldsoza.IdeasBroadApi.models.IdeasBroad;
import com.osvaldsoza.IdeasBroadApi.service.IdeasBroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ideas-broad")
public class IdeasBroadController {

    @Autowired
    IdeasBroadService service;

    @GetMapping
    public ResponseEntity<List<IdeasBroad>> getIdeas() {
        List<IdeasBroad> ideasList = service.getAllIdeasBroad();
        return new ResponseEntity<>(ideasList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<IdeasBroad> postIdea(@RequestBody IdeasBroad ideasBroad) {
        IdeasBroad idea = service.newIdea(ideasBroad);

        return new ResponseEntity<IdeasBroad>(idea, HttpStatus.CREATED);

    }
}
