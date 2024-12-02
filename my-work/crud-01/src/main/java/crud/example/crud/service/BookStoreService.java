package crud.example.crud.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import crud.example.crud.dao.IBookStoreDAO;
import crud.example.crud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookStoreService implements IBookStoreService {
    @Autowired
    private IBookStoreDAO dao;

    @Override
    public Book createBook(Book book) throws JsonProcessingException {

        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        String bookJson = objectMapper.writeValueAsString(book);
        System.out.println("book----------- service" + bookJson);

        return dao.createBook(book);
    }
}
