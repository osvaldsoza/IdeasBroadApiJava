package com.osvaldsoza.IdeasBroadApi;

import com.osvaldsoza.IdeasBroadApi.models.IdeasBroad;
import com.osvaldsoza.IdeasBroadApi.repositories.IdeasBroadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class IdeasBroadApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(IdeasBroadApiApplication.class, args);

//        List<IdeasBroad> ideas = new ArrayList<>();
//
//        IdeasBroad idea = new IdeasBroad();
//        idea.setId(1L);
//        idea.setTitle("A new cake recipe");
//        idea.setDescription("Make Chocolate");
//        idea.setDateCreated(new Date());
//
//        ideas.add(idea);
//
//        IdeasBroad idea1 = new IdeasBroad();
//        idea1.setId(1L);
//        idea1.setTitle("A twitter client idea");
//        idea1.setDescription("Only for replying to mentions and DMs");
//        idea1.setDateCreated(new Date());
//
//        ideas.add(idea1);
//
//        IdeasBroad idea2 = new IdeasBroad();
//        idea2.setId(1L);
//        idea2.setTitle("A novel set I intaly");
//        idea2.setDescription("A mafia crimm drama starning Belusconni");
//        idea2.setDateCreated(new Date());
//
//        ideas.add(idea2);
//
//        IdeasBroad idea3 = new IdeasBroad();
//        idea3.setId(1L);
//        idea3.setTitle("Card game design");
//        idea3.setDescription("Like Uno but involves drinking");
//        idea3.setDateCreated(new Date());
//
//        ideas.add(idea3);


    }


}
