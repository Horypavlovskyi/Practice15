abstract class Multicooker extends AbstractDevice {
    @Override
    void powerOn() {
        System.out.println("Втыкаем вилку в розетку, печь включается.");
    }

    @Override
    void powerOff() {
        System.out.println("Выткаем вилку из розетку, печь выключается.");
    }

    abstract void cook();
}
