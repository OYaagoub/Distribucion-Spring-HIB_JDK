package com.yaagoub.test;

import com.yaagoub.config.Configurations;
import com.yaagoub.repository.ImplementsDAO;
import com.yaagoub.services.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceTest {
    public static void main(String[] args) {
        // DAO x = new ImplementsDAO();
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);

        Service service = (Service) context.getBean("service");
        //ImplementsDAO dao = service.getDao();


        //Reserva r1 = service.getRes();

        // Use 'dao' instead of 'x' for consistency
        //boolean insert = dao.insert(r1);

        //dao.getData("Reserva").forEach(e -> {
        //    System.out.println("insertar: " + e);
        //});

        //r1.setNombre("ali");

        // Use 'dao' instead of 'x' for consistency
        //dao.update(r1);

        //dao.getData("Reserva").forEach(e -> {
        //    System.out.println(e);
        //});
        //((AnnotationConfigApplicationContext) context).close();
        // Use 'dao' instead of 'x' for consistency
        //Reserva z = (Reserva) dao.getById(Integer.parseInt(r1.getId()), Reserva.class);
        //System.out.println(z.toString());
    }
}
