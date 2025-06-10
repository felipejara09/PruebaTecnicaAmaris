

    public static void main(String[] args) {

        double base = 5;
        double altura = 3;
        double areaTriangulo = AreaCalculator.calcularAreaTriangulo(base, altura);
        System.out.println("Área del triángulo: " + areaTriangulo);

        double radio = 4;
        double areaCirculo = AreaCalculator.calcularAreaCirculo(radio);
        System.out.println("Área del círculo: " + areaCirculo);
    }

