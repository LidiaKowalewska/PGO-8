public class Task1Validator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();

        validator.addRule(form -> form.email().contains("@"));
        validator.addRule(form -> form.password().length() >= 8);
        validator.addRule(form -> form.age() >= 18);

        UserForm form1 = new UserForm("anna@example.com", "bezpieczne123", 20);
        System.out.println("Formularz 1 poprawny: " + validator.isValid(form1));

        UserForm form2 = new UserForm("jan@example.com", "krotkie", 20);
        System.out.println("Formularz 2 poprawny: " + validator.isValid(form2));
    }
}