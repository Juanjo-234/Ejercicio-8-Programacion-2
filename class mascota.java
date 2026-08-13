class mascota{

String nombre;
String especie;
int edad;

public mascota(String nombre, String especie, int edad){
this.nombre = nombre;
this.especie = especie;
this.edad = edad;

}

void crecer(double incremento){

    if(incremento> 0 ){
this.edad +=incremento;
System.out.println("Edad: " + incremento );

}
}

void mostrarResultados(){
    System.out.println("==============================");
    System.out.println("Nombre: " + nombre);
    System.out.println("Especie: " + especie);
    System.out.println("Edad: " + edad);
    System.out.println("==============================");
}

public static void main(String[] args) {

mascota mas1 = new mascota("Vitto", "Canne Corsso", 0);

mas1.crecer(1);
mas1.mostrarResultados();

mas1.crecer(1);
mas1.mostrarResultados();

mas1.crecer(1);
mas1.mostrarResultados();
}
}