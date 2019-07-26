package com.stackroute.test;

import com.stackroute.test.domain.Movie;
import com.stackroute.test.domain.Actor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        Actor actor =(Actor) context.getBean("actor");
//        System.out.println(actor);
        Movie movie =(Movie) context.getBean("movie");
        System.out.println(movie);

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Actor actor1=(Actor) factory.getBean("actor");
//        System.out.println(actor1);
        Movie movie1=(Movie) factory.getBean("movie");
        System.out.println(movie1);

    }
}
