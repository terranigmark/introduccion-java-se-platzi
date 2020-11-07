public class DataTypes {
    public static void main(String[] args) {

        int n = 1234567890;
        long nL = 12345678901L;
        double nD = 123.5678996;
        float nF = 123.5678996F;

        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Mulan The Cat";
        System.out.println("EMPLOYEE:" + employeeName + "SALARY: " + totalSalary);
    }
}