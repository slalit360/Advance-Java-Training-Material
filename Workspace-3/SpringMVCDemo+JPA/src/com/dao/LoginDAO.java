package com.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.bean.LoginBean;
import com.entity.Login;


@Component
public class LoginDAO {

	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}
	
		
	@Transactional
	public boolean validateUser(LoginBean loginBean)throws Exception{
	
		Query query=em.createQuery("select e from Login e where e.userName=:name and e.password=:pwd");
		query.setParameter("name", loginBean.getUserName());
		query.setParameter("pwd", loginBean.getPassword());
		List<Login> loginList=query.getResultList();
		if(loginList.size()== 0)
		{
			return false;
		}else{
			return true;
		}
	}
}
