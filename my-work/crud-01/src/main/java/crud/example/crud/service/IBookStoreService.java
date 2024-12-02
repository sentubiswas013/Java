package crud.example.crud.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import crud.example.crud.model.Book;

import java.util.List;

public interface IBookStoreService {
    Book createBook(Book book) throws JsonProcessingException;
}
