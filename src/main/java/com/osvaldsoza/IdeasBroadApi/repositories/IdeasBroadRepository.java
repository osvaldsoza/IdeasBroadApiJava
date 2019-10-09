package com.osvaldsoza.IdeasBroadApi.repositories;

import com.osvaldsoza.IdeasBroadApi.models.IdeasBroad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdeasBroadRepository extends JpaRepository<IdeasBroad, Long> {

    @Query("SELECT i FROM IdeasBroad i ORDER BY id DESC")
    List<IdeasBroad> findAllIdeasOrderByIdDesc();



}
