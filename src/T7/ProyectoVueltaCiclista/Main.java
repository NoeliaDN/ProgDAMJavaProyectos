package T7.ProyectoVueltaCiclista;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CorredorPopular corredor1 = new CorredorPopular("Carlos Lopez", 57, "Madrid",45.2);
        CorredorFederado corredor2 = new CorredorFederado("Ana Perez", 38, "Barcelona", 20.0, "XXXXX1111");
        CorredorElite corredor3 = new CorredorElite("Juan Garcia", 20, "Valencia", 10.5, "Colacao");
        CorredorJuvenil corredor4 = new CorredorJuvenil("Lucas Martinez", 16, "Sevilla",30.5, "Banco Banesto", "SUB 17" );
        //Corredor corredor5 = new Corredor("Paco Gutierrez", 20, "Almeria",20);
        System.out.println("CORREDOR 1");
        corredor1.mostrarInformacion();
        System.out.println("CORREDOR 2");
        corredor2.mostrarInformacion();
        corredor2.entrenar();
        corredor2.estorbar();
        System.out.println("CORREDOR 3");
        corredor3.mostrarInformacion();
        corredor3.premidoGanado(4000);
        corredor3.doparse();
        corredor3.estorbar();
        System.out.println("CORREDOR 4");
        corredor4.mostrarInformacion();
        corredor4.entrenar();


    }
}