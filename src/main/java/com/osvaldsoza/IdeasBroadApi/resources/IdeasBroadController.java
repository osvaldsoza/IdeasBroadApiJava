package com.osvaldsoza.IdeasBroadApi.resources;

import com.osvaldsoza.IdeasBroadApi.models.IdeasBroad;
import com.osvaldsoza.IdeasBroadApi.service.IdeasBroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ideasbroad")
@CrossOrigin(maxAge = 10, origins = {"http://localhost:3000"})
public class IdeasBroadController {

    @Autowired
    IdeasBroadService service;

    @GetMapping
    public ResponseEntity<List<IdeasBroad>> getIdeasOrderById1() {
        List<IdeasBroad> ideas = service.getAllIdeasBroad();
        return new ResponseEntity<>(ideas, HttpStatus.OK);
    }

    public ResponseEntity<List<IdeasBroad>> getIdeasOrderById() {
        List<IdeasBroad> ideasList = service.getIdeasBroadOrderByIdDesc();
        return new ResponseEntity<>(ideasList, HttpStatus.OK);
    }

    //@CrossOrigin(maxAge = 10, origins = {"http://localhost:3000"})
    @PostMapping
    public ResponseEntity<IdeasBroad> postIdea(@RequestBody IdeasBroad ideasBroad) {
        IdeasBroad idea = service.newIdea(ideasBroad);

        return new ResponseEntity<IdeasBroad>(idea, HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarIdea(@PathVariable Long id){
         service.deleteIdea(id);
         return new ResponseEntity<>(HttpStatus.OK);
    }
}
