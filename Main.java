import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcion = 0;
        Scanner scan = new Scanner(System.in);

        MAPfactory pfactory = new MAPfactory();

        HashMapp hm = (HashMapp) pfactory.fabricar(1);
        hm.crearHash();

        hm.crearHash();


        String salir = "no";
        while (salir.equals("no")){



            System.out.println(" ----- MENU ----- \n");
            System.out.println("Opciones: \n");
            System.out.println("1. Agregar  un producto a  la colección.");
            System.out.println("2. Mostrar la categoría de producto.");
            System.out.println("3. Mostrar  los  datos  del  producto, categoría y la cantidad en colección.");
            System.out.println("4. Mostrar el producto y la categoría de todo el inventario.");
            System.out.println("5. Salir.");

            opcion = scan.nextInt();
            scan.nextLine();

            if(opcion == 1 ){
                hm.crearHash();
                String categoria;
                String producto;
                int cantidad;


                System.out.println("¿De que categoria desea agregar?");
                categoria = scan.nextLine();
                System.out.println(categoria);


                System.out.println("¿Que producto desea agregar?");
                producto = scan.nextLine();




                System.out.println("¿Que cantidad desea agregar?");
                cantidad = scan.nextInt();
                scan.nextLine();

                hm.add(categoria, producto, cantidad);

            }
            else if(opcion == 2){
                System.out.println("ingrese el nombre del producto\n");
                String producto;

                producto = scan.nextLine();
                hm.showCategoryInfo(producto);
                System.out.println("");
            }
            else if(opcion == 3){
                //Mostrar  los  datos  del  producto, categoría y la cantidad en colección

                hm.showUserInfo();
            }
            else if(opcion == 4){
                //Mostrar el producto y la categoría de todo el inventario
                hm.showAllInfo();
            }
            else if(opcion == 5){
                salir = "si";
            }
}


/*

        hm.add("Mueble de terraza","Mesas de jardín", 4);
        hm.add("Mueble de terraza","Mesas de Ping Pong exteriores", 4);
        hm.add("Bebidas","Coca cola 1 litro", 4);
        hm.add("Sillones de masaje","Sofás camas", 1);
        hm.add("Condimentos","Sirope de regaliz", 7);
        hm.add("Frutas","Peras secas2", 7);
        hm.add("Carnes","Pollo", 7);
        hm.add("Lácteos","Leche entera2", 7);
        */

        //hm.showAllInfo();
        //System.out.println(hm.showCategoryInfo("Mesas de jardín"));
        //hm.showUserInfo();
    }
}