package com.studyd.stuff;

import com.storeonline.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by elevitchi on 6/6/2017.
 */
//@Repository
public class CategoryDAOImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public void addCategory(Category category) {
        entityManager.persist(category);
    }
}
