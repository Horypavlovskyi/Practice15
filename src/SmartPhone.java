public class SmartPhone extends Mobile implements Caller, MailSender {


    private String os;

    @Override
    public void call() {
        System.out.println("Находим приложене \"Почта\".");
    }

    @Override
    public String createMail() {
        System.out.println("Создаём электронную почту.");
        return "Почта 1 успешно создана.";
    }

    @Override
    public void sendMail() {
        System.out.println("Отсылаем электронную почту.");
    }

    void runApp() {
        System.out.println("Запускаем приложение.");
    }

}
