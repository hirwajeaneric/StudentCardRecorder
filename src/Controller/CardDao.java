package Controller;

import Model.Card;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.*;
import org.hibernate.Transaction;

public class CardDao {
    Session session;
    Transaction transaction;
    
    public void save(Card card){
        session=HibernateUtil.getSessionFactory().openSession();
        transaction=session.beginTransaction();
        session.save(card);
        transaction.commit();
        session.close();
    }
    
    public void update(Card card){
        session=HibernateUtil.getSessionFactory().openSession();
        transaction=session.beginTransaction();
        session.update(card);
        transaction.commit();
        session.close();
    }
        
    public void delete(Card card){
        session=HibernateUtil.getSessionFactory().openSession();
        transaction=session.beginTransaction();
        session.delete(card);
        transaction.commit();
        session.close();
    }
    
    public List<Card> CreateCardList(){
        session=HibernateUtil.getSessionFactory().openSession();
        transaction=session.beginTransaction();
        Query query = session.createQuery("From Card");
        List<Card> listofcards=query.list();
        transaction.commit();
        session.close();
        return listofcards;
    }
    
    /*
    public void numberOfCardsTaken(){
        session=HibernateUtil.getSessionFactory().openSession();
        transaction=session.beginTransaction();
        String cardIdNumber = session.create
        
    }*/
}
