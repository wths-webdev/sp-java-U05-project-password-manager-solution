//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PasswordManager pm = new PasswordManager();
        System.out.println(pm);

        pm.setUsername("Ash Ketchum");

        System.out.println(pm);

        pm.setPassword("bulbasaur1");

        System.out.println(pm);
    }
}