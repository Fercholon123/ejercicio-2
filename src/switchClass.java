public class switchClass {
    public static void main(String[] args){
        var estacion = "otoño";

        switch (estacion){
            case "verano":
            System.out.println("es verano");
            break;
            case "invierno":
            System.out.println("es invierno");
            break;
            case "otoño":
            System.out.println("es otono");
            break;
            case "primavera":
            System.out.println("es primavera");
            break;
            default:
                    System.out.println("no es una estacion");
        }


    }
}
