package com.jony.ModelDao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jony.modelDto.ModelDto;

@Component
public class ModelDao {

	public void save(ModelDto dto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usr");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(dto);
	
		
		transaction.commit();
		entityManager.close();
		
		
	}
	
	
	

	public List<ModelDto> read() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usr");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		
		Query query = entityManager.createQuery("from ModelDto");
		List list = query.getResultList();
		
		transaction.commit();
		
		System.out.println(list);
		entityManager.close();
		
		return list;
		
	}




	public void delete(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usr");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		

		
		ModelDto modelDto = entityManager.find(ModelDto.class, id);
		entityManager.remove(modelDto);
		transaction.commit();
		
		entityManager.close();
		
		
		
		
	}




	public ModelDto edit(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usr");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		ModelDto modelDto = entityManager.find(ModelDto.class, id);
		System.out.println(modelDto);
		
		transaction.commit();
		entityManager.close();
		
		return modelDto;
		
	}
	
	public void update(ModelDto dto) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("usr");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		
		//System.out.println("ID------"+dto.getId());
		ModelDto modelDto = entityManager.find(ModelDto.class, dto.getId());
		
		
		modelDto.setName(dto.getName());
		modelDto.setAge(dto.getAge());
		modelDto.setSalary(dto.getSalary());
		modelDto.setAddress(dto.getAddress());
		
		System.out.println(modelDto);
		
		entityManager.persist(modelDto);
		
		transaction.commit();
		entityManager.close();
		
		
	}
	

}
