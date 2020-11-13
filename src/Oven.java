public class Oven extends Multicooker{

    void initTimer (int pro1) {
        System.out.println("Выбираем время для приготовления.");
        switch (pro1) {
            case 1:
                System.out.println("Время приготовления 30 секунд.");
                break;

            case 2:
                System.out.println("Время приготовления 40 секунд.");
                break;

            case 3:
                System.out.println("Время приготовления 50 секунд.");
                break;

            default:
                System.out.println("Неверная команда");

        }
    }


    @Override
    void cook() {
        System.out.println("Печка начинает печь.\n");
    }
}
