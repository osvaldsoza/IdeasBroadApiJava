package com.osvaldsoza.IdeasBroadApi.repositories;

import com.osvaldsoza.IdeasBroadApi.models.IdeasBroad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeasBroadRepository extends JpaRepository<IdeasBroad, Long> {

}
