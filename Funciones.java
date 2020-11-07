public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        // Area de un circulo
        // pi * r^2
        double area = circleArea(y);
        System.out.println(area);

        // Area de una esfera
        // 4 * PI * r^2
        sphereArea(y);

        // Volumen de una esfera
        // (4/3) * PI * r^3
        sphereVolume(y);

        System.out.println("PESOS A DOLARES: " + convertToDolar(200, "MXN"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

/**
 * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
 *
 * @param amount Cantidad de dinero a convertir
 * @param currency Tipo de moneda: solo valida MXN o COP
 * @return amount Devuelve la cantidad actualizada en USD
 */


    public static double convertToDolar(double amount, String currency){
        // MXN COP
        switch (currency){
            case "MXN":
                amount = amount * 0.052;
                break;
            case "COP":
                amount = amount * 0.00031;
                break;
        }

        return amount;
    }
}