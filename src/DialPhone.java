public class DialPhone extends Phone implements Caller {

    private String hasAnswerPhone;


    @Override
    void powerOn() {
        System.out.println("Подключаем стационарный телефон к сети.");
    }

    @Override
    void powerOff() {
        System.out.println("Отключаем стационарный телефон от сети.\n");
    }

    @Override
    public void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним.");
    }

    void autoAnswer() {
        System.out.println("Когда не могут дозвониться, включается автоответчик:\n" +
                "\"Извините, я занят, вы можете оставить своё сообщение после звукового сигнала.\"");
    }

}
