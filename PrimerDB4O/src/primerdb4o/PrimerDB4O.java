package primerdb4o;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Scanner;

public class PrimerDB4O {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");

        int opc, opc2;

        String ALUMNOSBD = "C:\\Users\\HP MASTER\\Vehiculos.db4o";
        ObjectContainer db = Db4o.openFile(Db4o.newConfiguration(), ALUMNOSBD);

        do {
            System.out.println("--- Menú ---");
            System.out.println("1.- Consultar inventario");
            System.out.println("2.- Registrar nuevo vehículo");
            System.out.println("3.- Modificar un vehículo");
            System.out.println("4.- Eliminar vehículo");
            System.out.println("5.- Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Mostrar por:");
                    System.out.println("1.- Todos los registros");
                    System.out.println("2.- Número de serie");
                    System.out.println("3.- Marca");
                    System.out.println("4.- Modelo");
                    System.out.println("5.- Año");
                    System.out.println("6.- Color");
                    System.out.println("7.- Matricula");
                    System.out.println("8.- Numero de seguro");
                    System.out.println("9.- Fecha de ingreso");
                    opc2 = leer.nextInt();
                    switch (opc2) {
                        case 1:
                            ObjectSet resultados = db.queryByExample(new Vehiculo(0, null, null, 0, null, null, 0, null));
                            listResult(resultados);
                            break;
                        case 2:
                            System.out.println("Ingrese el número de serie");
                            ObjectSet resultados2 = db.queryByExample(new Vehiculo(leer.nextInt(), null, null, 0, null, null, 0, null));
                            listResult(resultados2);
                            break;
                        case 3:
                            System.out.println("Ingrese la marca");
                            ObjectSet resultados3 = db.queryByExample(new Vehiculo(0, leer.next(), null, 0, null, null, 0, null));
                            listResult(resultados3);
                            break;
                        case 4:
                            System.out.println("Ingrese el modelo");
                            ObjectSet resultados4 = db.queryByExample(new Vehiculo(0, null, leer.next(), 0, null, null, 0, null));
                            listResult(resultados4);
                            break;
                        case 5:
                            System.out.println("Ingrese el año");
                            ObjectSet resultados5 = db.queryByExample(new Vehiculo(0, null, null, leer.nextInt(), null, null, 0, null));
                            listResult(resultados5);
                            break;
                        case 6:
                            System.out.println("Ingrese el color");
                            ObjectSet resultados6 = db.queryByExample(new Vehiculo(0, null, null, 0, leer.next(), null, 0, null));
                            listResult(resultados6);
                            break;
                        case 7:
                            System.out.println("Ingrese la matricula");
                            ObjectSet resultados7 = db.queryByExample(new Vehiculo(0, null, null, 0, null, leer.next(), 0, null));
                            listResult(resultados7);
                            break;
                        case 8:
                            System.out.println("Ingrese el número de seguro");
                            ObjectSet resultados8 = db.queryByExample(new Vehiculo(0, null, null, 0, null, null, leer.nextInt(), null));
                            listResult(resultados8);
                            break;
                        case 9:
                            System.out.println("Ingrese la fecha de ingreso");
                            ObjectSet resultados9 = db.queryByExample(new Vehiculo(0, null, null, 0, null, null, 0, leer.next()));
                            listResult(resultados9);
                            break;
                        default:
                    }
                    break;
                case 2:
                    Vehiculo vehiculoNuevo = new Vehiculo();
                    System.out.println("Introduce el número de serie");
                    vehiculoNuevo.setSerie(leer.nextInt());
                    System.out.println("Introduce marca del vehiculo");
                    vehiculoNuevo.setMarca(leer.next());
                    System.out.println("Introduce el modelo del vehiculo");
                    vehiculoNuevo.setModelo(leer.next());
                    System.out.println("Introduce año del vehiculo");
                    vehiculoNuevo.setAño(leer.nextInt());
                    System.out.println("Introduce color del vehículo");
                    vehiculoNuevo.setColor(leer.next());
                    System.out.println("Introduce matricula del vehiculo");
                    vehiculoNuevo.setMatricula(leer.next());
                    System.out.println("Introduce número del seguro");
                    vehiculoNuevo.setSeguro(leer.nextInt());
                    System.out.println("Introduce fecha de ingreso");
                    vehiculoNuevo.setFechaIngreso(leer.next());
                    try {
                        db.store(vehiculoNuevo);
                    } finally {

                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero de serie del vehiculo que desea modificar");
                    ObjectSet buscarVehi = db.queryByExample(new Vehiculo(leer.nextInt(), null, null, 0, null, null, 0, null));
                    if (buscarVehi.hasNext()) {
                        Vehiculo modificar = (Vehiculo) buscarVehi.next();
                        System.out.println("Seleccione el campo que desea modificar:");
                        System.out.println("1.- Número de serie");
                        System.out.println("2.- Marca");
                        System.out.println("3.- Modelo");
                        System.out.println("4.- Año");
                        System.out.println("5.- Color");
                        System.out.println("6.- Matricula");
                        System.out.println("7.- Numero de seguro");
                        System.out.println("8.- Fecha de ingreso");
                        opc2 = leer.nextInt();
                        switch (opc2) {
                            case 1:
                                System.out.println("Ingrese el nuevo número de serie");
                                modificar.setSerie(leer.nextInt());
                                break;
                            case 2:
                                System.out.println("Ingrese la nueva marca");
                                modificar.setMarca(leer.next());
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo modelo");
                                modificar.setModelo(leer.next());
                                break;
                            case 4:
                                System.out.println("Ingrese el nuevo año");
                                modificar.setAño(leer.nextInt());
                                break;
                            case 5:
                                System.out.println("Ingrese el nuevo color");
                                modificar.setColor(leer.next());
                                break;
                            case 6:
                                System.out.println("Ingrese la nueva matricula");
                                modificar.setMatricula(leer.next());
                                break;
                            case 7:
                                System.out.println("Ingrese el nuevo número de seguro");
                                modificar.setSeguro(leer.nextInt());
                                break;
                            case 8:
                                System.out.println("Ingrese la nueva fecha de ingreso");
                                modificar.setFechaIngreso(leer.next());
                                break;
                            default:
                        }
                        db.store(modificar);
                        System.out.println("Registro modificado");
                        System.out.println(modificar);
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el numero de serie del vehiculo que desea eliminar");
                    ObjectSet eliminarVehi = db.queryByExample(new Vehiculo(leer.nextInt(), null, null, 0, null, null, 0, null));
                    if (eliminarVehi.hasNext()) {
                        Vehiculo encontrado = (Vehiculo) eliminarVehi.next();
                        db.delete(encontrado);
                        System.out.println("Se ha borrado a:");
                        System.out.println(encontrado);
                    } else {
                        System.err.println("No se encontraron Vehículos con el numero de serie ingresado");
                    }
                    break;
                case 5:
                    db.close();
                    break;
                default:
            }
        } while (opc != 5);

    }

    public static void listResult(ObjectSet s) {
        Vehiculo p;
        while (s.hasNext()) {
            p = (Vehiculo) s.next();
            System.out.println(p);
        }
    }

}
