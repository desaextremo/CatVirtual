package com.unab.catvirtual.catvirtualg31;

import com.unab.catvirtual.catvirtualg31.entity.Author;
import com.unab.catvirtual.catvirtualg31.entity.BookTwo;
import com.unab.catvirtual.catvirtualg31.entity.Category;
import com.unab.catvirtual.catvirtualg31.repository.AuthorRepository;
import com.unab.catvirtual.catvirtualg31.repository.BookRepository;
import com.unab.catvirtual.catvirtualg31.repository.BookTwoRepository;
import com.unab.catvirtual.catvirtualg31.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.unab.catvirtual.catvirtualg31.entity.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class CatVirtualG31Application implements CommandLineRunner {
    @Autowired
    private BookTwoRepository bookRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AuthorRepository authorRepository;


    public static void main(String[] args) {
        SpringApplication.run(CatVirtualG31Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Limpiar base de datos
        bookRepository.deleteAll();

        //Crear Libros

        Category oneCategory = Category.builder()
                                .id("1")
                                .name("NOVELAS").build();

        categoryRepository.insert(oneCategory);

        Author author = Author.builder()
                .id("1")
                .fisrtName("GABRIEL")
                .lastName("GARCIA MARQUEZ")
                .country("COLOMBIA")
                .about("REALISMO MÁGICO")
                .dateBorn(LocalDate.of(1927, 3, 6))
                .build();

        authorRepository.insert(author);

        BookTwo oneBook = BookTwo.builder()
                        .isbn("123")
                .title("CIEN AÑOS DE SOLEDAD")
                .pages(300)
                .price(56000)
                .year(1966)
                .seleccionado(false)
                .author(author)
                .category(oneCategory)
                .description("ENTRE LA BODA DE JOSÉ ARCADIO BUENDÍA CON AMELIA IGUARÁN HASTA LA MALDICIÓN DE AURELIANO BABILONIA TRANSCURRE TODO UN SIGLO. CIEN AÑOS DE SOLEDAD PARA UNA ESTIRPE ÚNICA, FANTÁSTICA, CAPAZ DE FUNDAR UNA CIUDAD TAN ESPECIAL COMO MACONDO Y DE ENGENDRAR NIÑOS CON COLA DE CERDO. EN MEDIO, UNA LARGA DOCENA DE PERSONAJES DEJARÁN SU IMPRONTA A LAS GENERACIONES VENIDERAS, QUE TENDRÁN QUE LIDIAR CON UN MUNDO TAN COMPLEJO COMO SENCILLO")
                .build();

        bookRepository.insert(oneBook);

        List<BookTwo> catalogo = bookRepository.findAll();
        System.out.println("Catalogo");
        for (BookTwo book:catalogo) {
            System.out.println(book);
        }
    }
}
