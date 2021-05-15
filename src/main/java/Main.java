/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 *  Основной класс
 */

public class Main {

    public static void main(String[] args) throws Exception {
        InjectTest injectTest = new Injector().inject(new InjectTest());
        injectTest.doSmth();
    }
}