package com.techbaba.jpa.practice;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

public class ExtendedPersistenceContextUserService {
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;
    
    @Transactional
    public User insertWithTransaction(User user) {
        entityManager.persist(user);
        return user;
    }
    
    public User insertWithoutTransaction(User user) {
        entityManager.persist(user);
        return user;
    }
    
    public User find(long id) {
        return entityManager.find(User.class, id);
    }
}
