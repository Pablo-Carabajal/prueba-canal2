import javax.swing.JOptionPane;

public class ejercicios2 {
    public static void main(String[] args) {

        float sueldo, sueldoM = 0;

        for (int i = 0; i < 3; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("digite el monto del sueldo:"));

            if (sueldo > sueldoM) {

                sueldoM = sueldo;
            }
        }
        System.out.println("el sueldo mayor es: $ " + sueldoM);

    }

}
