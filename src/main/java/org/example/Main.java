package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var c1 = c.getBean(CommentService.class);
        //var c2 = c.getBean("commentService", CommentService.class);
        var c2 = c.getBean(UserService.class);

        boolean b = c1.getRepository() == c2.getRepository();
        System.out.println(b);
        System.out.println(c1.getRepository());
        System.out.println(c2.getRepository());
    }
}