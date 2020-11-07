public class Switch {
    public static void main(String[] args) {

        String colorModeSelected = "Naranja";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Seleccionate Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionate Night Mode");
                break;
            case "Dark":
                System.out.println("Seleccionate Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion valida");
        }
    }
}