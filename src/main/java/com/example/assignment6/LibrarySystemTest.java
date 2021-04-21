package com.example.assignment6;

import com.example.assignment6.configuration.SpringConfiguration;
import com.example.assignment6.controller.LibraryController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibrarySystemTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        LibraryController controller = context.getBean("libraryController", LibraryController.class);
    }
}
