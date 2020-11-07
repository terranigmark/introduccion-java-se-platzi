public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // bono $200
        salary = salary + 200;
        System.out.println(salary);

        // pension $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        // 2 hrs extra $30 c/u
        // comida $45
        salary = salary + (30 * 2) - 45;
        System.out.println(salary);

        // actualizando cadenas de texto
        String employeeName = "Mulan";
        employeeName = employeeName + " The Cat";
        System.out.println(employeeName);
    }
}