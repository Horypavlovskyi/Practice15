public class MulticookerV2 extends Multicooker {


    void switchProgram(int pro1) {
        System.out.println("Выбираем программу для приготовления.");
        switch (pro1) {
            case 1:
                System.out.println("Выбрана 1 программа. Еда готовиться 30 секунд.");
                break;

            case 2:
                System.out.println("Выбрана 2 программа. Еда готовиться 40 секунд.");
                break;

            case 3:
                System.out.println("Выбрана 3 программа. Еда готовиться 50 секунд.");
                break;

            default:
                System.out.println("Неверная команда");

        }
    }

    @Override
    void cook() {
        System.out.println("Мультиварка начинает готовить.\n");
    }
}
