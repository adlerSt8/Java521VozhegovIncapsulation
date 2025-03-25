//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TODO: Задание 1. Программа контроля работы детского карточного банковского счета
        System.out.println("Задание 1.");
        ChildBankAccount account = new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());

        System.out.println("-----------------------------------------------");

        //TODO: Задание 2. Создайте класс для хранения данных о странах (POJO)
        System.out.println("Задание 2.");
        CountryData country = new CountryData("Russia");
        country.setNameCapital("Moscow");
        country.setAccessSea(true);
        System.out.println("Country: " + country.getCountryName());
        System.out.println("Capital: " + country.getNameCapital());
        System.out.println("Access to the sea: " + country.getIsAccessSea());

        System.out.println("-----------------------------------------------");

        //TODO: Задание 3. Модифицируйте класс и добавьте в него неизменяемое поле
        System.out.println("Задание 3.");
        Product product = new Product("Шоколад", "4603955000758");
        product.setPrice(120);
        System.out.println("Товар: " + product.getName());
        System.out.println("Цена: " + product.getPrice());
        }
}