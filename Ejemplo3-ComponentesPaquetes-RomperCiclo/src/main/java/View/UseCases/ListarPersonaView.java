package View.UseCases;

import Controllers.ControllerUseCase1;
import DTO.PersonaDTO;
import InteractorsUseCases.DefaultUseCaseFactory;
import InteractorsUseCases.UseCaseFactory;


public class ListarPersonaView {
     private ControllerUseCase1 controllerUseCase1;

    public ListarPersonaView(ControllerUseCase1 controllerUseCase1) {
        this.controllerUseCase1 = controllerUseCase1;
        mostrarInformacion();
    }
    
    private void mostrarInformacion(){
        System.out.println("---------------------------------------------------------.");
        System.out.println("Imprimiendo la información de las personas registradas.");
        System.out.println("---------------------------------------------------------.");
        for (PersonaDTO personaDTO : controllerUseCase1.listadoPersonas()) {
            System.out.println("-->"+personaDTO.toString());
          }        
        System.out.println("---------------------------------------------------------.");
    }

}
