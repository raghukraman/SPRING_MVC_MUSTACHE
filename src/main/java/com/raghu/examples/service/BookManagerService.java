package com.raghu.examples.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.raghu.examples.vo.Author;
import com.raghu.examples.vo.Book;

@Service
public class BookManagerService implements IBookManagerService {

    @Override
    public Book find(Book search) {

        if (search != null && search.getName().equalsIgnoreCase("*high sellers*")) {

            List<Book> booklist = new ArrayList<Book>() {
                {
                    List<Author> book1Author = new ArrayList<Author>() {

                        {
                            Author author1 = new Author("mugil ", "32", "M");
                            add(author1);
                        }
                    };
                    List<Author> book2Author = new ArrayList<Author>() {

                        {
                            Author author2 = new Author("Bala   ", "48", "M");
                            add(author2);
                        }
                    };
                    List<Author> book3Author = new ArrayList<Author>() {

                        {
                            Author author3_1 = new Author("mugil   ", "40", "M");
                            Author author3_2 = new Author("Natajan   ", "45", "M");
                            add(author3_1);
                            add(author3_2);
                        }
                    };
                    Book book1 = new Book("Hitler - Sollapadatha Sarithiram", "ISBN A123232323", "http://www.amazon.in/dp/938306708X",
                                          null, book1Author, 30);
                    Book book2 = new Book("Evan Than Bala", "ISBN ZTom122322", "http://books.vikatan.com/index.php?bid=1194", null, book2Author,
                                          500);
                    Book book3 = new Book("Atlas", "ISBN DWE&2343434", "http://www.amazon.in/dp/8174784314", null, book3Author, 1000);
                    add(book1);
                    add(book2);
                    add(book3);
                }
            };
            List<Author> book1Author = new ArrayList<Author>() {

                {
                    Author author1 = new Author("Natarajan", "45", "M");
                    add(author1);
                }
            };

            Book match = new Book("Mossad", "12323ef323", "Amazon.com/natrajan", booklist, book1Author, 250);
            return match;
        } else if (search != null && search.getIsbn().equalsIgnoreCase("100")) {
            List<Author> book1Author = new ArrayList<Author>() {

                {
                    Author author1 = new Author("Herbert Schildt", "60", "M");
                    add(author1);
                }
            };
            
            List<Author> matchBookAuthor = new ArrayList<Author>() {

                {
                    Author matchauthor = new Author("Natajan   ", "45", "M");
                    add(matchauthor);
                }
            };

            Book match = new Book("Java Complete Reference", "10: 0071606300",
                                  "http://www.amazon.in/Java-The-Complete-Reference-Edition/dp/0071606300", null,
                                  book1Author, 250);
            return match;
        } else {
            return null;
        }

    }
    
    public Book findMore(Book search) {
        List<Book> booklist = new ArrayList<Book>() {

            {
                List<Author> book1Author = new ArrayList<Author>() {

                    {
                        Author author1 = new Author("Greg Nees  ", "32", "M");
                        add(author1);
                    }
                };
                List<Author> book2Author = new ArrayList<Author>() {

                    {
                        Author author2 = new Author("Sylvia Schroll-Macht ", "48", "M");
                        add(author2);
                    }
                };
                List<Author> book3Author = new ArrayList<Author>() {

                    {
                        Author author3_1 = new Author("Andrea Schulte-Peevers  ", "40", "M");
                        Author author3_2 = new Author("Kerry Christiani   " , "45", "M");
                        Author author3_3 = new Author("Marc Di Duca  ", "40", "M");
                        Author author3_4 = new Author(" Daniel Robinson  " , "45", "M");
                        Author author3_5 = new Author(" Daniel Robinson  " , "45", "M");
                        
                        
                        add(author3_1);
                        add(author3_2);
                        add(author3_3);
                        add(author3_4);
                        add(author3_5);
                    }
                };
                List<Author> book4Author = new ArrayList<Author>() {

                    {
                        Author author2 = new Author("Edmund Janes James  ", "48", "M");
                        add(author2);
                    }
                };
                List<Author> book5Author = new ArrayList<Author>() {

                    {
                        Author author2 = new Author("Edmund Janes James  ", "48", "M");
                        add(author2);
                    }
                };
                
                
                Book book1 = new Book("Germany: Unravelling an Enigma", "1877864757", "http://www.amazon.in/dp/1877864757",
                                      null, book1Author, 30);
                Book book2 = new Book("Doing Business with Germans: Their Perception, Our Perceptio", "3525461674", "http://www.amazon.in/dp/3525461674", null, book2Author,
                                      500);
                Book book3 = new Book("Lonely Planet Germany (Travel Guide) ", "1741798442", "http://www.amazon.in/dp/1741798442", null, book3Author, 1000);
                Book book4 = new Book("The Federal Constitution of Germany: With an Historical Introduction ", "1146329644", "http://www.amazon.in/dp/1741798442", null, book4Author, 1000);
                Book book5 = new Book("The New Germany ", "1741798442", "http://www.amazon.in/dp/1741798442", null, book3Author, 1000);
                add(book1);
                add(book2);
                add(book3);
                add(book4);
                add(book5);
            }
        };
        List<Author> book1Author = new ArrayList<Author>() {

            {
                Author author1 = new Author("Natarajan", "45", "M");
                add(author1);
            }
        };

        Book match = new Book("Switzerland and the Swiss: Sketches of the Country and Its Famous Men", "1142470199", "Amazon.com/natrajan", booklist, book1Author, 250);
        return match;
    }

}
