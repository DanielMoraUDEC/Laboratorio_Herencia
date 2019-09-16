package herencia;

import javax.swing.JOptionPane;

public class estudiante  extends persona{

private String carnet;    
private double promedioNotas;
private int numeroMaterias;

    double promedioNotas1 = 0.0;
    int numNotas = 0;
    double notas = 0.0;

    public estudiante() {
    }

    public estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }


   

    public String getCarnet() {
        return carnet;
    }

   
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

   
    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

  
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public void calcularPromedio (){
       promedioNotas=notas/numeroMaterias;
       
    }
    public double leerNotasEstudiante(){
        notas=0;
        double acumulado;
        numeroMaterias = leerDatoTipoEntero("ingrese el numero de materias: ");
        for (int i = 0; i < numeroMaterias; i++) {
            acumulado = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota de la materia "+(i+1)+": "));
            notas = notas+acumulado;  
            
        }
       return notas;
        
    }
    public void ingresarDatosEstudiante(){
        estudiante nuevoEstudiante = new estudiante();
    
    nombre = leerDatoTipoCadena("Ingrese el nombre del empleado: ");
    apellido = leerDatoTipoCadena("Ingrese el apellido del empleado: ");
    edad = leerDatoTipoEntero("Ingrese la edad del empleado: ");
    peso = leerDatoTipoReal("Ingrese el peso del empleado: ");
    carnet = leerDatoTipoCadena("Ingrese el codigo del carnet: ");
    
   leerNotasEstudiante();
   calcularPromedio();
    
//Definimos los datos para el constructor
nuevoEstudiante.setNombre(nombre);
nuevoEstudiante.setApellido(apellido);
nuevoEstudiante.setEdad(edad); 
nuevoEstudiante.setPeso(peso);
nuevoEstudiante.setNumeroMaterias(numeroMaterias);
nuevoEstudiante.setPromedioNotas(promedioNotas);


        
    }
    public void imprimirReporteNotasEstudiante(){
        
        imprimirDatosPersona();
        
        JOptionPane.showMessageDialog(null, "El codigo del carne es: " +carnet);
        JOptionPane.showMessageDialog(null, "El numero de materias es: " +numeroMaterias);
        JOptionPane.showMessageDialog(null, "El promedio de notas es: " +promedioNotas);
        
        
        
        
    }
    
    

}

