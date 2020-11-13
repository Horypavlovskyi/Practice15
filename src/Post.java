public class Post implements MailSender {


    @Override
    public String createMail() {
        return "Письмо успешно создано!";
    }

    @Override
    public void sendMail() {
        System.out.println("Письмо успешно отправлено!");
    }
}
