public class Mobile extends Phone{

    private int simCount;
    private String display;

    @Override
    void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается.");
    }

    @Override
    void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Мобильный телефон выключается.\n");
    }

    @Override
    void call() {
        System.out.println("Выбираем контакт из меню, звоним.");
    }

}
