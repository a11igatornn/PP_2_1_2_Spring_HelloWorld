import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW1.getMessage());
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW2.getMessage());

        Cat beanC1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanC1.getName());
        Cat beanC2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanC2.getName());

        System.out.println(beanHW1 == beanHW2);
        System.out.println(beanC1 == beanC2);
    }
}