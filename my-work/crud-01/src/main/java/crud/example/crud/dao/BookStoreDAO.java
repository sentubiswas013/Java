package crud.example.crud.dao;

import crud.example.crud.model.Book;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository
public class BookStoreDAO implements IBookStoreDAO {

//    @PersistenceContext
//    private EntityManager entityManager;

    @Override
    public Book createBook(Book book) {
        // Persist the book object
        // entityManager.persist(book);

        // Return the book object that was just persisted
        return book;
    }

//    @Override
//    public Book createBook(Book book) {
//        System.out.println("entityManager-----" + entityManager);
//        entityManager.persist(book);
//        Book book = getLastInsertedBook();
//        return book;
//    }

//    private Book getLastInsertedBook(){
//        String hql = "from Book order by id DESC";
//        Query query = entityManager.createQuery(hql);
//        query.setMaxResults(1);
//        Book book = (Book)query.getSingleResult();
//        return book;
//    }
}
