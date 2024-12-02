package crud.example.crud.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import crud.example.crud.model.Book;
import crud.example.crud.service.IBookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api")
public class BookStoreController {
    @Autowired
    private IBookStoreService service;

    @PostMapping("books")
    public ResponseEntity<Book> createBook(@RequestBody Book book) throws JsonProcessingException {
        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        String bookJson = objectMapper.writeValueAsString(book);
        System.out.println("book-----------controller" + bookJson);

//        try {
//            String bookJson = objectMapper.writeValueAsString(book);
//            System.out.println("book-----------" + bookJson);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Book b = service.createBook(book);
        return new ResponseEntity<Book>(b, HttpStatus.OK);

    }
}
