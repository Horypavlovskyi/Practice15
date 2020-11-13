import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.call();
        mobile.powerOff();

        SmartPhone smartPhone = new SmartPhone();

        mobile.call();
        smartPhone.runApp();
        smartPhone.call();
        smartPhone.createMail();
        smartPhone.sendMail();

        Post post = new Post();
        post.createMail();
        post.sendMail();

        smartPhone.powerOff();

        DialPhone dialPhone = new DialPhone();


        dialPhone.call();
        dialPhone.autoAnswer();
        dialPhone.powerOff();

        MulticookerV2 multicookerV2 = new MulticookerV2();

        multicookerV2.switchProgram(1);
        multicookerV2.cook();

        Oven oven = new Oven();

        oven.initTimer(2);
        oven.cook();

    someMethod(smartPhone,dialPhone);

    someMethodv2(smartPhone,post);

    }
    public static void someMethod (AbstractDevice... var) {
        System.out.println(Arrays.toString(var) + " Устройства выключены!");
    }

    public static void someMethodv2 (MailSender... var) {
        System.out.println(Arrays.toString(var) + " Письма отправлены!");
    }




}
