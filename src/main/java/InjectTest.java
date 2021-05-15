/**
 * @autor Бокша Валерия
 * 3 курс, 61 группа
 * @version 1.0
 *  Класс, где что-либо будет инжектиться
 */

public class InjectTest {

    /**
     * Помечает поле, которое будет инжектиться
     */
    @AutoInjectable

    /**
     * Любой наследник SomeInterface
     */
    private SomeInterface child;

    public void doSmth (){

        child.doSmth();
    }
}