package com.company.ex20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author author1=new Author();
        author1.setName("Kathy");
        author1.setSurname("Sierra");
        author1.setGender(Author.gen.FEMALE);

        Author author2=new Author();
        author2.setName("Bert");
        author2.setSurname("Bates");
        author2.setGender(Author.gen.MALE);

        ArrayList<Author> book1Authors=new ArrayList<>();
        book1Authors.add(author1);
        book1Authors.add(author2);

        Book book1=new Book();
        book1.setTitle("Head First Java");
        book1.setAuthors(book1Authors);
        book1.setPrice(50.0);
    }
}
