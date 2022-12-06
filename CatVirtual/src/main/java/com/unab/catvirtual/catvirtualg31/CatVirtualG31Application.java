package com.unab.catvirtual.catvirtualg31;

import com.unab.catvirtual.catvirtualg31.entity.*;
import com.unab.catvirtual.catvirtualg31.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class CatVirtualG31Application implements CommandLineRunner {
    @Autowired
    private BookTwoRepository bookRepository;

    @Autowired
    private BookTrhreeRepository bookTrhreeRepository;
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
        //bookRepository.deleteAll();

        //Crear Libros
        Author oneAuthor;
        Category oneCategory;

        Optional<Author> optionalOne = authorRepository.findById("638f979151acf982df27453a");
        Optional<Category> optionalTwo = categoryRepository.findById("638f778751acf982df27452c");
        /*
        if ((!optionalOne.isEmpty())&&(!optionalTwo.isEmpty())){
            oneAuthor = optionalOne.get();
            oneCategory = optionalTwo.get();

            BookTwo oneBook = BookTwo.builder()
                    .isbn("123")
                    .title("LA CIUDAD Y LOS PERROS")
                    .pages(472)
                    .price(45000)
                    .year(1963)
                    .seleccionado(false)
                    .author(oneAuthor)
                    .category(oneCategory)
                    .description("LA OBRA ESTÁ AMBIENTADA EN EL COLEGIO MILITAR LEONCIO PRADO, DONDE ADOLESCENTES Y JÓVENES INTERNOS RECIBEN FORMACIÓN ESCOLAR SECUNDARIA BAJO UNA SEVERA DISCIPLINA MILITAR. SE NARRAN LAS DIFERENTES HISTORIAS DE UNOS MUCHACHOS QUE DESCUBREN Y APRENDEN A CONVIVIR CON UNA FORMA DE VIDA ALIENANTE QUE NO LES PERMITE DESARROLLARSE COMO PERSONAS, Y DONDE SE LES SOMETE Y HUMILLA. NO OBSTANTE, A TRAVÉS DE ESTE SISTEMA, ALGUNOS ENCUENTRAN LA FORTALEZA NECESARIA PARA ASUMIR SUS RETOS.")
                    .build();

            bookRepository.insert(oneBook);

            List<BookTwo> catalogo = bookRepository.findAll();
            System.out.println("Catalogo de libros");
            for (BookTwo book:catalogo) {
                System.out.println(book);
            }
        }else{
            System.out.printf("Por favor valide sus datos");
        }
        */
        /*
        if ((!optionalOne.isEmpty())&&(!optionalTwo.isEmpty())){
            oneAuthor = optionalOne.get();
            oneCategory = optionalTwo.get();

            BookTrhree oneBook = BookTrhree.builder()
                    .isbn("123")
                    .title("LA CIUDAD Y LOS PERROS")
                    .pages(472)
                    .price(45000)
                    .year(1963)
                    .seleccionado(false)
                    .author(oneAuthor)
                    .category(oneCategory)
                    .description("LA OBRA ESTÁ AMBIENTADA EN EL COLEGIO MILITAR LEONCIO PRADO, DONDE ADOLESCENTES Y JÓVENES INTERNOS RECIBEN FORMACIÓN ESCOLAR SECUNDARIA BAJO UNA SEVERA DISCIPLINA MILITAR. SE NARRAN LAS DIFERENTES HISTORIAS DE UNOS MUCHACHOS QUE DESCUBREN Y APRENDEN A CONVIVIR CON UNA FORMA DE VIDA ALIENANTE QUE NO LES PERMITE DESARROLLARSE COMO PERSONAS, Y DONDE SE LES SOMETE Y HUMILLA. NO OBSTANTE, A TRAVÉS DE ESTE SISTEMA, ALGUNOS ENCUENTRAN LA FORTALEZA NECESARIA PARA ASUMIR SUS RETOS.")
                    .build();

            bookTrhreeRepository.insert(oneBook);

            List<BookTrhree> catalogo = bookTrhreeRepository.findAll();
            System.out.println("Catalogo de libros");
            for (BookTrhree book:catalogo) {
                System.out.println(book.getAuthor());
            }
        }else{
            System.out.printf("Por favor valide sus datos");
        }

        */

        List<BookTrhree> catalogo = bookTrhreeRepository.findAll();
        System.out.println("Catalogo de libros");
        for (BookTrhree book:catalogo) {
            System.out.println(book.getAuthor());
        }

    }
}
