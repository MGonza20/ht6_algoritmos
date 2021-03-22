

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HashMapp<E> implements MAP {
    /*
    HM sirve para crear un diccionario en cual guardamos todas las listas
    inventario guarda el inventario con su cantidad
    collecionU se utiliza para guardar el inventario separado por categoria pero sin cantidad
    coleccion genera un diccionario donde estan los productos y su cantidad
     */
    private final HashMap<String, ArrayList<List<String>>> HM;
    private final HashMap<String, HashMap<String,Integer>> inventario;
    private final HashMap<String, HashMap<String,Integer>> carritoU;
    private HashMap<String, ArrayList<String>> coleccionU;
    private HashMap<String, ArrayList<String>> coleccionU2;
    private final HashMap<String, HashMap<String, Integer>> hashU;
    private final HashMap<String, Integer> coleccionCantB;
    private final HashMap<String, Integer> coleccionCantF;
    private final HashMap<String, Integer> coleccionCantL;
    private final HashMap<String, Integer> coleccionCantM;
    private final HashMap<String, Integer> coleccionCantS;
    private final HashMap<String, Integer> coleccionCantC;
    private final HashMap<String, Integer> coleccionCantCo;


    private final HashMap<String, Integer> coleccionCantB2;
    private final HashMap<String, Integer> coleccionCantF2;
    private final HashMap<String, Integer> coleccionCantL2;
    private final HashMap<String, Integer> coleccionCantM2;
    private final HashMap<String, Integer> coleccionCantS2;
    private final HashMap<String, Integer> coleccionCantC2;
    private final HashMap<String, Integer> coleccionCantCo2;

    //Luego completo el constructor
    public HashMapp() {
        HM = new HashMap<String, ArrayList<List<String>>>();
        coleccionU =new HashMap<>();
        coleccionU2 =new HashMap<>();
        coleccionCantB =new HashMap<>();
        coleccionCantM =new HashMap<>();
        coleccionCantC =new HashMap<>();
        coleccionCantCo =new HashMap<>();
        coleccionCantF =new HashMap<>();
        coleccionCantS =new HashMap<>();
        coleccionCantL =new HashMap<>();
        hashU =new HashMap<String, HashMap<String, Integer>>();
        inventario = new HashMap<String, HashMap<String, Integer>>();
        carritoU = new HashMap<String, HashMap<String, Integer>>();

        coleccionCantB2 =new HashMap<>();
        coleccionCantM2 =new HashMap<>();
        coleccionCantC2 =new HashMap<>();
        coleccionCantCo2 =new HashMap<>();
        coleccionCantF2 =new HashMap<>();
        coleccionCantS2 =new HashMap<>();
        coleccionCantL2 =new HashMap<>();

    }


    public void crearHash() {

        ArrayList<List<String>> lista = new ArrayList<>();
        ArrayList<HashMap<String, Integer>> lista2 = new ArrayList<>();


        for (int i = 0; i < leerDocu().size(); i++) {

            lista.add(Arrays.asList(leerDocu().get(i).split("[|]", 0)));

            HM.put(lista.get(i).get(0), lista);



        }
        int f = 0;


        ArrayList<List<String>> lista3 = new ArrayList<>();
        for (int j= 0; j<lista.size();j++){
            for(int i=0;i<HM.keySet().size();i++){
                if (lista.get(j).get(0).equals(HM.keySet().toArray()[i])){

                    lista3.add(lista.get(j));
                    HM.put(lista.get(i).get(0), lista3);

            }

            }
        }
        ArrayList<String> bebidas = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[1])){

                    bebidas.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), bebidas);
                    for(int j = 0; j<bebidas.size();j++){
                        coleccionCantB.put(bebidas.get(j), 10);

                    }
                   inventario.put(lista.get(i).get(0),coleccionCantB);

                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> frutas = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[5])){

                    frutas.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), frutas);
                    for(int j = 0; j<frutas.size();j++){
                        coleccionCantF.put(frutas.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantF);
                }
            }
        } catch (Exception e) {

        }

        ArrayList<String> sillones = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[6])){

                    sillones.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), sillones);
                    for(int j = 0; j<sillones.size();j++){
                        coleccionCantS.put(sillones.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantS);

                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> condimentos = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[3])){

                    condimentos.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), condimentos);
                    for(int j = 0; j<condimentos.size();j++){
                        coleccionCantCo.put(condimentos.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantCo);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> lacteos = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[2])){

                    lacteos.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), lacteos);
                    for(int j = 0; j<lacteos.size();j++){
                        coleccionCantL.put(lacteos.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantL);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> carnes = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[4])){

                    carnes.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), carnes);
                    for(int j = 0; j<carnes.size();j++){
                        coleccionCantC.put(carnes.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantC);
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> mueblesT = new ArrayList<>();
        try {
            for (int i= 0; i<lista3.size();i++){

                if(lista.get(i).get(0).equals(HM.keySet().toArray()[0])){

                    mueblesT.add(lista.get(i).get(1).toUpperCase());
                    coleccionU.put(lista.get(i).get(0), mueblesT);
                    for(int j = 0; j<mueblesT.size();j++){
                        coleccionCantM.put(mueblesT.get(j), 10);

                    }
                    inventario.put(lista.get(i).get(0),coleccionCantM);

                }
            }
        } catch (Exception e) {

        }


        //System.out.println(inventario.entrySet());
        //System.out.println(inventario.get("Mueble de terraza"));

        }


    @Override
    public void add(String key, String value, int cant) {
        value = value.toUpperCase();
        int contador = 0;
        int contador2 = 0;
        for (int i= 0; i<inventario.keySet().size();i++){
            if(!key.equals(inventario.keySet().toArray()[i])){
                contador= contador+1;
            }
            else if(key.equals(inventario.keySet().toArray()[i])){
                for(int j = 0; j<inventario.get(key).size();j++){
                    if(!inventario.get(key).keySet().toArray()[j].equals(value)){
                        contador2= contador2+1;
                    }

                }

            }
        }
        if (contador==7){
            System.out.println("Categoria no encontrada: " + key);
        }

        if (inventario.get(key) != null ){
            if(contador2 == inventario.get(key).size()){
                System.out.println("Producto no encontrado en categoria: " + key);
            }

        }


        ArrayList<String> mueblesT = new ArrayList<>();
        try {
            for (int i= 0; i<inventario.keySet().size();i++){

                if(inventario.keySet().toArray()[i].equals(key) && coleccionCantM.containsKey(value)){

                    mueblesT.add(value);
                    String d = inventario.keySet().toArray()[i].toString();
                    coleccionU2.put(d, mueblesT);
                    for(int j = 0; j<mueblesT.size();j++){
                        if(mueblesT.get(j).equals(value)&& coleccionCantM2.get(value) != null  && coleccionCantM2.get(value)+cant <11){

                            coleccionCantM2.put(mueblesT.get(j), coleccionCantM2.get(value)+cant);
                            coleccionCantM.put(value,coleccionCantM2.get(value)-cant);


                        }
                        else if(coleccionCantM2.get(value) == null){
                            coleccionCantM2.put(mueblesT.get(j), cant);
                        }
                        else{
                            System.out.println("Cantidad disponible: " + coleccionCantM.get(value));
                        }


                    }

                    hashU.put(d,coleccionCantM2);


                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> bebidas = new ArrayList<>();
        try {
            for (int i= 0; i<inventario.keySet().size();i++){

                if(inventario.keySet().toArray()[i].equals(key) && coleccionCantB.containsKey(value)){

                    bebidas.add(value);
                    String d = inventario.keySet().toArray()[i].toString();
                    coleccionU2.put(d, bebidas);
                    for(int j = 0; j<bebidas.size();j++){
                        if(bebidas.get(j).equals(value)&& coleccionCantB2.get(value) != null  && coleccionCantB2.get(value)+cant <11){

                            coleccionCantB2.put(bebidas.get(j), coleccionCantB2.get(value)+cant);
                            coleccionCantB.put(value,coleccionCantB2.get(value)-cant);


                        }
                        else if(coleccionCantM2.get(value) == null){
                            coleccionCantB2.put(bebidas.get(j), cant);
                            coleccionCantB.put(value,coleccionCantB.get(value)-cant);
                        }
                        else{
                            System.out.println("Cantidad disponible: " + coleccionCantB.get(value));
                        }


                    }

                    hashU.put(d,coleccionCantB2);


                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> frutas = new ArrayList<>();
        try {
            for (int i= 0; i<inventario.keySet().size();i++){

                if(inventario.keySet().toArray()[i].equals(key) && coleccionCantF.containsKey(value)){

                    frutas.add(value);
                    String d = inventario.keySet().toArray()[i].toString();
                    coleccionU2.put(d, frutas);
                    for(int j = 0; j<frutas.size();j++){
                        if(frutas.get(j).equals(value)&& coleccionCantF2.get(value) != null  && coleccionCantF2.get(value)+cant <11){

                            coleccionCantF2.put(frutas.get(j), coleccionCantF2.get(value)+cant);
                            coleccionCantF.put(value,coleccionCantF.get(value)-cant);


                        }
                        else if(coleccionCantF2.get(value) == null){
                            coleccionCantF2.put(frutas.get(j), cant);
                            coleccionCantF.put(value,coleccionCantF.get(value)-cant);
                        }
                        else{
                            System.out.println("Cantidad disponible: " + coleccionCantF.get(value));
                        }


                    }

                    hashU.put(d,coleccionCantF2);

                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> condimentos = new ArrayList<>();
        try {
            for (int i= 0; i<inventario.keySet().size();i++){

                if(inventario.keySet().toArray()[i].equals(key) && coleccionCantCo.containsKey(value)){

                    condimentos.add(value);
                    String d = inventario.keySet().toArray()[i].toString();
                    coleccionU2.put(d, condimentos);
                    for(int j = 0; j<condimentos.size();j++){
                        if(condimentos.get(j).equals(value)&& coleccionCantCo2.get(value) != null  && coleccionCantCo2.get(value)+cant <11){

                            coleccionCantCo2.put(condimentos.get(j), coleccionCantCo2.get(value)+cant);
                            coleccionCantCo.put(value,coleccionCantCo.get(value)-cant);


                        }
                        else if(coleccionCantCo2.get(value) == null){
                            coleccionCantCo2.put(condimentos.get(j), cant);
                        }
                        else{
                            System.out.println("Cantidad disponible: " + coleccionCantCo.get(value));
                        }


                    }

                    hashU.put(d,coleccionCantCo2);


                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> carnes = new ArrayList<>();
        try {
            for (int i= 0; i<inventario.keySet().size();i++){

                if(inventario.keySet().toArray()[i].equals(key) && coleccionCantC.containsKey(value)){

                    carnes.add(value);
                    String d = inventario.keySet().toArray()[i].toString();
                    coleccionU2.put(d, carnes);
                    for(int j = 0; j<carnes.size();j++){
                        if(carnes.get(j).equals(value)&& coleccionCantC2.get(value) != null  && coleccionCantC2.get(value)+cant <11){

                            coleccionCantC2.put(carnes.get(j), coleccionCantC2.get(value)+cant);
                            coleccionCantC.put(value,coleccionCantC.get(value)-cant);


                        }
                        else if(coleccionCantC2.get(value) == null){
                            coleccionCantC2.put(carnes.get(j), cant);
                            coleccionCantC.put(value,coleccionCantC.get(value)-cant);
                        }
                        else{
                            System.out.println("Cantidad disponible: " + coleccionCantC.get(value));
                        }


                    }

                    hashU.put(d,coleccionCantC2);


                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> lacteos = new ArrayList<>();
        try {
            for (int i= 0; i<inventario.keySet().size();i++){

                if(inventario.keySet().toArray()[i].equals(key)&& coleccionCantL.containsKey(value)){

                    lacteos.add(value);
                    String d = inventario.keySet().toArray()[i].toString();
                    coleccionU2.put(d, lacteos);
                    for(int j = 0; j<lacteos.size();j++){
                        if(lacteos.get(j).equals(value)&& coleccionCantL2.get(value) != null  && coleccionCantL2.get(value)+cant <11){

                            coleccionCantL2.put(lacteos.get(j), coleccionCantL2.get(value)+cant);
                            coleccionCantL.put(value,coleccionCantL.get(value)-cant);


                        }
                        else if(coleccionCantL2.get(value) == null){
                            coleccionCantL2.put(lacteos.get(j), cant);
                            coleccionCantL.put(value,coleccionCantL.get(value)-cant);
                        }
                        else{
                            System.out.println("Cantidad disponible: " + coleccionCantL.get(value));
                        }


                    }

                    hashU.put(d,coleccionCantL2);


                }
                else{
                   // System.out.println("categoria no encontrada");
                }
            }
        } catch (Exception e) {

        }
        ArrayList<String> sillones = new ArrayList<>();
        int c= 0;
        try {
            for (int i= 0; i<inventario.keySet().size();i++){

                if(inventario.keySet().toArray()[i].equals(key) && coleccionCantS.containsKey(value)){

                    sillones.add(value);
                    String d = inventario.keySet().toArray()[i].toString();
                    coleccionU2.put(d, sillones);
                    for(int j = 0; j<sillones.size();j++){
                        if(sillones.get(j).equals(value) && coleccionCantS2.get(value) != null  && coleccionCantS2.get(value)+cant <11){

                            coleccionCantS2.put(sillones.get(j), coleccionCantS.get(value)+cant);
                            coleccionCantS.put(value,coleccionCantS.get(value)-cant);


                        }
                        else if(coleccionCantS2.get(value) == null){
                            coleccionCantS2.put(sillones.get(j), cant);

                            coleccionCantS.put(value,coleccionCantS.get(value)-cant);
                        }
                        else{
                            System.out.println("Cantidad disponible: " + coleccionCantS.get(value));
                        }


                    }

                    hashU.put(d,coleccionCantS2);


                }

            }

        }

        catch (Exception e) {

        }

    }

    @Override
        public String showAllInfo () {
            System.out.println("*******inventario*******");
            for (int j=0; j<inventario.get(inventario.keySet().toArray()[0]).size();j++){
                System.out.println(inventario.keySet().toArray()[0]+"------>"+ coleccionCantM.keySet().toArray()[j] + "--" + coleccionCantM.get(coleccionCantM.keySet().toArray()[j]));
            }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[1]).size();j++){
            System.out.println(inventario.keySet().toArray()[1]+"------>"+ coleccionCantB.keySet().toArray()[j] + "--Cantidad--" + coleccionCantB.get(coleccionCantB.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[2]).size();j++){
            System.out.println(inventario.keySet().toArray()[2]+"------>"+ coleccionCantL.keySet().toArray()[j] + "--" + coleccionCantL.get(coleccionCantL.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[3]).size();j++){
            System.out.println(inventario.keySet().toArray()[3]+"------>"+ coleccionCantCo.keySet().toArray()[j] + "--" + coleccionCantCo.get(coleccionCantCo.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[4]).size();j++){
            System.out.println(inventario.keySet().toArray()[4]+"------>"+ coleccionCantC.keySet().toArray()[j] + "--" + coleccionCantC.get(coleccionCantC.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[5]).size();j++){
            System.out.println(inventario.keySet().toArray()[5]+"------>"+ coleccionCantF.keySet().toArray()[j] + "--" + coleccionCantF.get(coleccionCantF.keySet().toArray()[j]));
        }
        for (int j=0; j<inventario.get(inventario.keySet().toArray()[6]).size();j++){
            System.out.println(inventario.keySet().toArray()[6]+"------>"+ coleccionCantS.keySet().toArray()[j] + "--" + coleccionCantS.get(coleccionCantS.keySet().toArray()[j]));
        }
            return"j";
        }

        @Override
        public Object showCategoryInfo (String producto){
        producto= producto.toUpperCase();
        String data= "";
        String[] categorias = inventario.keySet().toArray(new String[0]);
        for(int i= 0; i< categorias.length; i++){
            inventario.get(categorias[i]);
            //System.out.println(categorias[i]);
            for(int j = 0; j<inventario.get(categorias[i]).size(); j++){


                if(inventario.get(categorias[i]).keySet().toArray()[j].equals(producto)){
                    data= categorias[i] + "----->" + producto+ "---->" + inventario.get(categorias[i]).get(producto);

                }
            }
        }
        return data;
        }

    @Override
    public String showUserInfo() {
        System.out.println("************Carrito del cliente****************");
        for (int j=0; j<coleccionCantM2.size();j++){
            System.out.println(inventario.keySet().toArray()[0]+"------>"+ coleccionCantM2.keySet().toArray()[j] + "--" + coleccionCantM2.get(coleccionCantM2.keySet().toArray()[j]));
        }
        for (int j=0; j<coleccionCantB2.size();j++){
            System.out.println(inventario.keySet().toArray()[1]+"------>"+ coleccionCantB2.keySet().toArray()[j] + "--Cantidad--" + coleccionCantB2.get(coleccionCantB2.keySet().toArray()[j]));
        }
        for (int j=0; j<coleccionCantL2.size();j++){
            System.out.println(inventario.keySet().toArray()[2]+"------>"+ coleccionCantL2.keySet().toArray()[j] + "--" + coleccionCantL2.get(coleccionCantL2.keySet().toArray()[j]));
        }
        for (int j=0; j<coleccionCantCo2.size();j++){
            System.out.println(inventario.keySet().toArray()[3]+"------>"+ coleccionCantCo2.keySet().toArray()[j] + "--" + coleccionCantCo2.get(coleccionCantCo2.keySet().toArray()[j]));
        }
        for (int j=0; j<coleccionCantC2.size();j++){
            System.out.println(inventario.keySet().toArray()[4]+"------>"+ coleccionCantC2.keySet().toArray()[j] + "--" + coleccionCantC2.get(coleccionCantC2.keySet().toArray()[j]));
        }
        for (int j=0; j<coleccionCantF2.size();j++){
            System.out.println(inventario.keySet().toArray()[5]+"------>"+ coleccionCantF2.keySet().toArray()[j] + "--" + coleccionCantF2.get(coleccionCantF2.keySet().toArray()[j]));
        }
        for (int j=0; j<coleccionCantS2.size();j++){
            System.out.println(inventario.keySet().toArray()[6]+"------>"+ coleccionCantS2.keySet().toArray()[j] + "--" + coleccionCantS2.get(coleccionCantS2.keySet().toArray()[j]));
        }
        return"j";
    }


    public ArrayList<String> leerDocu () {
            // TODO Auto-generated method stub
            String texto = new String();

            // TODO Auto-generated method stub
            ArrayList<String> operacion = new ArrayList<String>();
            try {
                FileReader fr = new FileReader("ListadoProducto.txt");// Objeto para que establece origen de los datos
                BufferedReader entrada = new BufferedReader(fr); // buffer para el manejo de los datos
                String s;
                while ((s = entrada.readLine()) != null)// leer linea a linea
                    texto += s + "\n";
                operacion = new ArrayList<String>(Arrays.asList(texto.split("[\n]", 0)));

                entrada.close();

                // impresion de los datos leidos en pantalla
            } catch (java.io.FileNotFoundException fnfex) {
                System.out.println("Archivo no encontrado: ");
            } catch (java.io.IOException ioex) {

            }

            return operacion;
        }
    public static void aniadirArchivo(String categoria, String producto) {
        FileWriter flwriter = null;
        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros
            flwriter = new FileWriter("ListadoProducto.txt", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            bfwriter.write( categoria + "|  " + producto + "\n");
            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente..");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }
