public class IfStatement{
    public static void main(String[] args) {

        boolean isBluetoothEnabled = false;
        int fileSent = 3;

        if (isBluetoothEnabled){
            // send file
            fileSent++;
            System.out.println("Archivo Enviado");
        } else {
            fileSent--;
            System.out.println("Por favor enciende el Bluetooth de tu dispositivo para iniciar la transferencia.");
        }
    }
}