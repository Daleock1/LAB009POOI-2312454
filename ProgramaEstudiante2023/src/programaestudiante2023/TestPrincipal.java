package programaestudiante2023;

import java.util.Scanner;

public class TestPrincipal {

	public static void main(String[] args) {

		Estudiantes2023 xxx = new Estudiantes2023();
		xxx.listarEstudiantes();
	
		        Scanner scanner = new Scanner(System.in);
		        int choice = 0;

		        while (choice != 10) {
		        	
		     
		            System.out.println("\n\n****** BIENVENIDOS AL SISTEMA DE GESTION DE ESTUDIANTES ******");
		            System.out.println("1-NUEVO ESTUDIANTE");
		            System.out.println("2-BUSCAR ESTUDIANTE");
		            System.out.println("3-ELIMINAR ESTUDIANTE");
		            System.out.println("4-MODIFICAR ESTUDIANTE");
		            System.out.println("5-MODIFICAR APELLIDOS EN MINÚSCULAS");
		            System.out.println("6-VER TODOS LOS ESTUDIANTES");
		            System.out.println("7-VER TODOS LOS ESTUDIANTES POR APELLIDOS");
		            System.out.println("8-VER TODOS LOS ESTUDIANTES POR PENSIÓN");
		            System.out.println("9-TOTAL DE PENSIONES");
		            System.out.println("10-SALIR");
		            System.out.print("¿QUÉ ACTIVIDAD DESEA EJECUTAR?");

		            if (scanner.hasNextInt()) {
		                choice = scanner.nextInt();

		                switch (choice) {
		                    case 1:
		                        System.out.println("Seleccionaste NUEVO ESTUDIANTE");
		                       
		                        break;
		                    case 2:
		                        System.out.println("Seleccionaste BUSCAR ESTUDIANTE");
		                      
		                        break;
		                    case 3:
		                        System.out.println("Seleccionaste ELIMINAR ESTUDIANTE");
		                        
		                        break;
		                    case 4:
		                        System.out.println("Seleccionaste MODIFICAR ESTUDIANTE");
		                        
		                        break;
		                    case 5:
		                        System.out.println("Seleccionaste MODIFICAR APELLIDOS EN MINÚSCULAS");
		                       
		                        break;
		                    case 6:
		                        System.out.println("Seleccionaste VER TODOS LOS ESTUDIANTES");
		                        
	                        break;
		                    case 7:
		                        System.out.println("Seleccionaste VER TODOS LOS ESTUDIANTES POR APELLIDOS");
		                       
		                        break;
		                    case 8:
		                        System.out.println("Seleccionaste VER TODOS LOS ESTUDIANTES POR PENSIÓN");
		                        
		                        break;
		                    case 9:
		                        System.out.println("Seleccionaste TOTAL DE PENSIONES");
		                        
		                        break;
		                    case 10:
		                        System.out.println("Saliendo del sistema");
		                        break;
		                    default:
		                        System.out.println("Elige una opción válida");
		                }
		            } else {
		                System.out.println("Ingresa un número válido");
		                scanner.next();
		            }
		        }

		        scanner.close();
		    }
		

}
