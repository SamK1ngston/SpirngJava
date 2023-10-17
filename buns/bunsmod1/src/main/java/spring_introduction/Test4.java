package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//Java-Code(1)
public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
