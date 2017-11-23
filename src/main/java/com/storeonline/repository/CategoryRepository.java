package com.storeonline.repository;

import com.storeonline.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by elevitchi on 7/24/2017.
 */
@Repository
public interface CategoryRepository extends BaseRepository<Category, Long> {

}
