package com.unab.catvirtual.catvirtualg31;

import com.unab.catvirtual.catvirtualg31.entity.*;
import com.unab.catvirtual.catvirtualg31.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.DoubleStream;


@SpringBootApplication
public class CatVirtualG31Application implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookTwoRepository bookTwoRepository;

    @Autowired
    private BookThreeRepository bookThreeRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private AuthorsRepository authorsRepository;

    public static void main(String[] args) {
        SpringApplication.run(CatVirtualG31Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        categoryRepository.deleteAll();
        authorsRepository.deleteAll();
        bookRepository.deleteAll();
        bookTwoRepository.deleteAll();
        bookThreeRepository.deleteAll();


        //Consultar datos del libro
        List<Book> catalogo =  bookRepository.findAll();
        System.out.println("Catalogo de Libros actualizado");
        for (Book book:catalogo) {
            System.out.println(book.toString());
        }


        //Crea un libro de tipo BookTwo

        //primero creamos las categorias
        categoryRepository.saveAll(List.of(
                Category.builder().id("1").name("NOVELAS").build(),
                Category.builder().id("2").name("CUENTOS").build(),
                Category.builder().id("3").name("REPORTAJE").build(),
                Category.builder().id("4").name("CIENCIA FICCIÓN").build(),
                Category.builder().id("5").name("NOVELAS AVENTURAS").build(),
                Category.builder().id("6").name("NOVELA NEGRA").build()
        ));

        List<Category> listaCategorias =  categoryRepository.findAll();
        System.out.println("Catalogo de Categorias");
        for (Category category:listaCategorias) {
            System.out.println(category.toString());
        }

        //luego creamos los autores
        authorsRepository.saveAll(List.of(
                Author.builder().id("1").
                        fisrtName("GABRIEL").
                        lastName("GARCIA MARQUEZ").
                        dateBorn(LocalDate.parse("1927-03-06")).
                        country("COLOMBIA").
                        about("REALISMO MAGICO")
                .build(),
                Author.builder().id("2").
                        fisrtName("MARIO").
                        lastName("VARGAS LLOSA").
                        dateBorn(LocalDate.parse("1936-03-28")).
                        country("PERU").
                        about("UN TIPO CON SUERTE")
                        .build(),
                Author.builder().id("3").
                        fisrtName("ISABEL").
                        lastName("ALLENDE").
                        dateBorn(LocalDate.parse("1942-08-02")).
                        country("COLOMBIA").
                        about("LOS ESPIRITUS")
                        .build()
        ));

        List<Author> listaAutores =  authorsRepository.findAll();
        System.out.println("Catalogo de Autores");
        for (Author author:listaAutores) {
            System.out.println(author.toString());
        }



        Category categoryOne;
        categoryOne = categoryRepository.findById("1").get();

        Author autOne,autTwo,autTrhee;

        autOne = authorsRepository.findById("1").get();
        autTwo = authorsRepository.findById("2").get();
        autTrhee = authorsRepository.findById("3").get();

        bookTwoRepository.saveAll(List.of(
                BookTwo.builder()
                        .isbn("123")
                        .title("CIEN AÑOS DE SOLEDAD")
                        .pages(300)
                        .price(45000)
                        .year(1967)
                        .description("ENTRE LA BODA DE JOSÉ ARCADIO BUENDÍA CON AMELIA IGUARÁN HASTA LA MALDICIÓN DE AURELIANO BABILONIA TRANSCURRE TODO UN SIGLO. CIEN AÑOS DE SOLEDAD PARA UNA ESTIRPE ÚNICA, FANTÁSTICA, CAPAZ DE FUNDAR UNA CIUDAD TAN ESPECIAL COMO MACONDO Y DE ENGENDRAR NIÑOS CON COLA DE CERDO. EN MEDIO, UNA LARGA DOCENA DE PERSONAJES DEJARÁN SU IMPRONTA A LAS GENERACIONES VENIDERAS, QUE TENDRÁN QUE LIDIAR CON UN MUNDO TAN COMPLEJO COMO SENCILLO.")
                        .author(autOne)
                        .category(categoryOne)
                        .build(),
                BookTwo.builder()
                        .isbn("124")
                        .title("LA GUERRA DEL FIN DEL MUNDO")
                        .pages(350)
                        .price(6000)
                        .year(1981)
                        .description("RECREA LITERARIAMENTE LA GUERRA DE CANUDOS, ACONTECIMIENTO HISTÓRICO OCURRIDO EN 1897, EN EL QUE SE MOVILIZARON HACIA EL NORDESTE BRASILEÑO MÁS DE 10 000 SOLDADOS. LA TRAMA OCURRE EN EL NORDESTE BRASILEÑO, AZOTADO POR SEQUÍAS Y PLAGAS, DONDE LOS TERRATENIENTES HAN TENIDO TRADICIONALMENTE EL PODER, EN UNA NARRACIÓN APOCALÍPTICA, PUES SE ACERCA EL CAMBIO DE SIGLO Y EL POSIBLE FIN DEL MUNDO.")
                        .author(autOne)
                        .category(categoryOne)
                        .build(),
                BookTwo.builder()
                        .isbn("125")
                        .title("LARGO PÉTALO DE MAR")
                        .pages(280)
                        .price(55000)
                        .year(2019)
                        .description("EN PLENA GUERRA CIVIL ESPAÑOLA, EL JOVEN MEDICO VÍCTOR DALMAU, JUNTO A SU AMIGA PIANISTA ROSER BRUGUERA, SE VEN OBLIGADOS A ABANDONAR BARCELONA, EXILIARSE Y CRUZAR LOS PIRINEOS RUMBO A FRANCIA. A BORDO DEL WINNIPEG, UN NAVÍO FLETADO POR EL POETA PABLO NERUDA QUE LLEVÓ A MÁS DE DOS MIL ESPAÑOLES RUMBO A VALPARAÍSO, EMBARCARÁN EN BUSCA DE LA PAZ Y LA LIBERTAD QUE NO TUVIERON EN SU PAÍS. RECIBIDOS COMO HEROES EN CHILE -ESE  LARGO PETALO DE MAR Y NIEVE , EN PALABRAS DEL POETA CHILENO-, SE INTEGRARÁN EN LA VIDA SOCIAL DEL PAÍS DURANTE VARIAS DECADAS HASTA EL GOLPE DE ESTADO QUE DERROCÓ AL DOCTOR SALVADOR ALLENDE, AMIGO DE VICTOR POR SU COMÚN AFICIÓN AL AJEDREZ. VÍCTOR Y ROSER SE ENCONTRARÁN NUEVAMENTE DESARRAIGADOS, PERO COMO DICE LA AUTORA:  SI UNO VIVE LO SUFICIENTE, ODOS LOS CÍRCULOS SE CIERRAN.")
                        .author(autOne)
                        .category(categoryOne)
                        .build()
        ));
        */
        /*
        DoubleStream BooThree;
        bookThreeRepository.saveAll(List.of(
                BookThree.builder()
                        .isbn("123")
                        .title("CIEN AÑOS DE SOLEDAD")
                        .pages(300)
                        .price(45000)
                        .year(1967)
                        .description("ENTRE LA BODA DE JOSÉ ARCADIO BUENDÍA CON AMELIA IGUARÁN HASTA LA MALDICIÓN DE AURELIANO BABILONIA TRANSCURRE TODO UN SIGLO. CIEN AÑOS DE SOLEDAD PARA UNA ESTIRPE ÚNICA, FANTÁSTICA, CAPAZ DE FUNDAR UNA CIUDAD TAN ESPECIAL COMO MACONDO Y DE ENGENDRAR NIÑOS CON COLA DE CERDO. EN MEDIO, UNA LARGA DOCENA DE PERSONAJES DEJARÁN SU IMPRONTA A LAS GENERACIONES VENIDERAS, QUE TENDRÁN QUE LIDIAR CON UN MUNDO TAN COMPLEJO COMO SENCILLO.")
                        .author(autOne)
                        .category(categoryOne)
                        .build(),
                BookThree.builder()
                        .isbn("124")
                        .title("LA GUERRA DEL FIN DEL MUNDO")
                        .pages(350)
                        .price(6000)
                        .year(1981)
                        .description("RECREA LITERARIAMENTE LA GUERRA DE CANUDOS, ACONTECIMIENTO HISTÓRICO OCURRIDO EN 1897, EN EL QUE SE MOVILIZARON HACIA EL NORDESTE BRASILEÑO MÁS DE 10 000 SOLDADOS. LA TRAMA OCURRE EN EL NORDESTE BRASILEÑO, AZOTADO POR SEQUÍAS Y PLAGAS, DONDE LOS TERRATENIENTES HAN TENIDO TRADICIONALMENTE EL PODER, EN UNA NARRACIÓN APOCALÍPTICA, PUES SE ACERCA EL CAMBIO DE SIGLO Y EL POSIBLE FIN DEL MUNDO.")
                        .author(autOne)
                        .category(categoryOne)
                        .build(),
                BookThree.builder()
                        .isbn("125")
                        .title("LARGO PÉTALO DE MAR")
                        .pages(280)
                        .price(55000)
                        .year(2019)
                        .description("EN PLENA GUERRA CIVIL ESPAÑOLA, EL JOVEN MEDICO VÍCTOR DALMAU, JUNTO A SU AMIGA PIANISTA ROSER BRUGUERA, SE VEN OBLIGADOS A ABANDONAR BARCELONA, EXILIARSE Y CRUZAR LOS PIRINEOS RUMBO A FRANCIA. A BORDO DEL WINNIPEG, UN NAVÍO FLETADO POR EL POETA PABLO NERUDA QUE LLEVÓ A MÁS DE DOS MIL ESPAÑOLES RUMBO A VALPARAÍSO, EMBARCARÁN EN BUSCA DE LA PAZ Y LA LIBERTAD QUE NO TUVIERON EN SU PAÍS. RECIBIDOS COMO HEROES EN CHILE -ESE  LARGO PETALO DE MAR Y NIEVE , EN PALABRAS DEL POETA CHILENO-, SE INTEGRARÁN EN LA VIDA SOCIAL DEL PAÍS DURANTE VARIAS DECADAS HASTA EL GOLPE DE ESTADO QUE DERROCÓ AL DOCTOR SALVADOR ALLENDE, AMIGO DE VICTOR POR SU COMÚN AFICIÓN AL AJEDREZ. VÍCTOR Y ROSER SE ENCONTRARÁN NUEVAMENTE DESARRAIGADOS, PERO COMO DICE LA AUTORA:  SI UNO VIVE LO SUFICIENTE, ODOS LOS CÍRCULOS SE CIERRAN.")
                        .author(autOne)
                        .category(categoryOne)
                        .build()
        ));


        //Consultar datos del libro
        List<Book> catalogo =  bookRepository.findAll();
        System.out.println("Catalogo de Libros campos Author y Categoria de tipo String");
        for (Book book:catalogo) {
            System.out.println(book.toString());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        List<BookTwo> listaLibros =  bookTwoRepository.findAll();
        System.out.println("Catalogo de Libros Two- campos Author y Categoria de tipo Clase con relacion embebida");
        for (BookTwo bookTwo:listaLibros) {
            System.out.println(bookTwo.toString());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        List<BookThree> listaLibrosThree =  bookThreeRepository.findAll();
        System.out.println("Catalogo de Libros Three- campos Author y Categoria de tipo Clase con relacion mediante referencias");
        for (BookThree bookThree:listaLibrosThree) {
            System.out.println(bookThree.toString());
        }


        Category category = categoryRepository.findById("63992959acbdba3b8a97fd2e").get();
        Author authorOne = authorsRepository.findById("63992c48a83fec3b54d98f9a").get();

        bookThreeRepository.deleteAll();
        //Ejemplo con relaciones mediante referencias
        bookThreeRepository.saveAll(
                List.of(BookThree.builder().isbn("123")
                                .title("EL GENERAL EN SU LABERINTO")
                                .description("ULTIMOS DIAS DE BOLIVAR")
                                .pages(300)
                                .price(45000)
                                .year(1990)
                                .seleccionado(true)
                                .category(category)
                                .author(authorOne)
                                .build(),
                        BookThree.builder().isbn("124")
                                .title("CIEN AÑOS DE SOLEDAD")
                                .description("ENTRE LA BODA DE JOSÉ ARCADIO BUENDÍA CON AMELIA IGUARÁN HASTA LA MALDICIÓN DE AURELIANO BABILONIA TRANSCURRE TODO UN SIGLO. CIEN AÑOS DE SOLEDAD PARA UNA ESTIRPE ÚNICA, FANTÁSTICA, CAPAZ DE FUNDAR UNA CIUDAD TAN ESPECIAL COMO MACONDO Y DE ENGENDRAR NIÑOS CON COLA DE CERDO. EN MEDIO, UNA LARGA DOCENA DE PERSONAJES DEJARÁN SU IMPRONTA A LAS GENERACIONES VENIDERAS, QUE TENDRÁN QUE LIDIAR CON UN MUNDO TAN COMPLEJO COMO SENCILLO.")
                                .pages(280)
                                .price(45000)
                                .year(1990)
                                .seleccionado(true)
                                .category(category)
                                .author(authorOne)
                                .build(),
                        BookThree.builder().isbn("125")
                                .title("CRÓNICA DE UNA MUERTE ANUNCIADA")
                                .description("CRÓNICA DE UNA MUERTE ANUNCIADA ES UNA NOVELA CORTA DE GABRIEL GARCÍA MÁRQUEZ, PUBLICADA EN 1981. TOMANDO ELEMENTOS DEL REALISMO MÁGICO Y DEL RELATO POLICIAL, LA NOVELA CUENTA LA MUERTE DE SANTIAGO NASAR A MANOS DE LOS HERMANOS VICARIO.")
                                .pages(280)
                                .price(45000)
                                .year(1990)
                                .seleccionado(true)
                                .category(category)
                                .author(authorOne)
                                .build()
                )
        );

         */
    }
}
