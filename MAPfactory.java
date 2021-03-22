
public class MAPfactory {

    public static MAP fabricar(int Type) {
        switch (Type) {
            case 1: //HashMap
                //Arreglar nombre cuando esté listo
                return new HashMapp();
            default:
                System.out.println("No existe en el sistema");
                return null;
        }
    }
}
