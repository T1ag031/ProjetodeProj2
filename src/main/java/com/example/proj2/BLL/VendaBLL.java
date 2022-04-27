package com.example.proj2.BLL;

import com.example.proj2.DAL.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class VendaBLL implements Serializable {
    private static final String PERSISTENCE_UNIT_NAME = "default";
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static Venda findVendaNumvenda(int numvenda) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Venda.class, numvenda);
        } finally {
            em.close();
        }
    }

    public static List<Venda> findVendaEntities() {
        List<Venda> vendas;
        EntityManager em = getEntityManager();
        CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Venda.class));
        Query q = em.createQuery(cq);
        vendas=((List<Venda>) q.getResultList());
        em.close();
        return vendas;
    }

    public static void create(Venda venda) {
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(venda);
        em.getTransaction().commit();
        em.close();
    }


    public static void deleteVenda(int idvenda){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Venda venda;
        venda = em.getReference(Venda.class, idvenda);
        venda.setNumvenda(idvenda);
        venda.getNumvenda();
        em.remove(venda);
        em.getTransaction().commit();
        em.close();
    }

    //EDITAR DADOS VENDA

    public static void editDateVenda(int numvenda, Date date){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Venda venda;
        em.getTransaction().begin();
        venda = em.find(Venda.class, numvenda);
        venda.setData((java.sql.Date) date);
        em.persist(venda);
        em.getTransaction().commit();
        em.close();
    }

    public static void editValorVenda(int numvenda, float valor){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction();
        Venda venda;
        em.getTransaction().begin();
        venda = em.find(Venda.class, numvenda);
        venda.setValortotal(BigDecimal.valueOf(valor));
        em.persist(venda);
        em.getTransaction().commit();
        em.close();
    }

    //OBTER O Nº DE VENDAS

    public static int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Venda.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}