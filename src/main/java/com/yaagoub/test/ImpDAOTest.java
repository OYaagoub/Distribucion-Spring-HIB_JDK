package com.yaagoub.test;

import com.yaagoub.config.Configurations;
import com.yaagoub.repository.ImplementsDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImpDAOTest {
    public static void main(String[] args) {
        // DAO x = new ImplementsDAO();
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        ImplementsDAO dao = (ImplementsDAO) context.getBean("implementsDAO");



        //Reserva r1 = new Reserva("oussama", "yaagoub", "h", "A4", "T1 madrid", "Av. Imperio romano 82 Consuegra");

        // Use 'dao' instead of 'x' for consistency
        //boolean insert = dao.insert(r1);

        dao.getData("Reserva").forEach(e -> {
            System.out.println("insertar: " + e);
        });

        //r1.setNombre("ali");

        // Use 'dao' instead of 'x' for consistency
        //dao.update(r1);

        dao.getData("Reserva").forEach(e -> {
            System.out.println(e);
        });
        ((AnnotationConfigApplicationContext) context).close();
        // Use 'dao' instead of 'x' for consistency
        //Reserva z = (Reserva) dao.getById(Integer.parseInt(r1.getId()), Reserva.class);
        //System.out.println(z.toString());
    }
}
