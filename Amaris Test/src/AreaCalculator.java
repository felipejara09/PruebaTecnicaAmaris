public class AreaCalculator {

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}
