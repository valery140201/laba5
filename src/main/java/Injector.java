/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 * Класс Injector
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

public class Injector {
    /** Поле свойств */
    private Properties properties;

    /**
     * Конструктор
     * Получает свойства из файла
     */
    public Injector() {
        this.properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream ("C:/Users/bocsh/IdeaProjects/laba5/src/main/resources/properties.properties");
            properties.load(inputStream);
        } catch(IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Inject метод
     * @param object - некоторый объект
     * Находит все поля, помеченные аннотацией @AutoInjectable
     * Помещает объект, указанный в свойствах в поля
     * @return объект
     */
    public <T> T inject (T object) throws Exception {


        for (Field field : object.getClass().getDeclaredFields()
        ) {
            if (field.getAnnotation(AutoInjectable.class) != null) {
                field.setAccessible(true);
                field.set(object, Class.forName(properties.getProperty(field.toString().split(" ")[1])).getDeclaredConstructor().newInstance());
            }
        }
        return object;
    }

}