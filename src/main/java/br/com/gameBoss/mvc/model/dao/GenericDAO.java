package br.com.gameBoss.mvc.model.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.gameBoss.mvc.model.BaseEntity;
import br.com.gameBoss.mvc.model.Client;

public class GenericDAO<T extends BaseEntity> {
	private EntityManager em = new Connection().getConnection();
	
	 
	 public T findById(Class<T> clazz, Long id){
		 try {
			 return em.find(clazz, id);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			finally{
				em.close();
			}
	 }
	 
	 public T saveOrUpdate(T obj){
			
			try {
				em.getTransaction().begin();
				if (obj.getId() == null) {
					em.persist(obj);
				}else {
					em.merge(obj);
				}
				
				em.getTransaction().commit();
				
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw new RuntimeException(e);
				
			}
			finally{
				em.clear();
			}
			return obj;
		}
	
	 public void remove(Class<T> clazz, Long id){
		T t = findById(clazz, id);
		 try {
				em.getTransaction().begin();
				em.remove(t);
				em.getTransaction().commit();
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw new RuntimeException(e); 
			}
			finally{
				em.close();
			}
	 }
	 public Collection<T> searchList(Class<T> clazz,T obj){
			Collection<T> list = null; 
			try {
				TypedQuery<T> query = em.createQuery("from :pObject c",clazz);
				query.setParameter("pObject", obj);
				
				list = query.getResultList();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			finally{
				em.close();
			}
			return list;
		}
}
