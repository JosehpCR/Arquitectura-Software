
package View.UseCases;

import Controllers.ControllerUseCase1;
import DTO.PersonaDTO;
import InteractorsUseCases.DefaultUseCaseFactory;
import InteractorsUseCases.UseCaseFactory;


public class CrearPersonaView {
    private ControllerUseCase1 controllerUseCase1;

    public CrearPersonaView( ControllerUseCase1 controllerUseCase1) {
        this.controllerUseCase1 = controllerUseCase1;
    }
    public void adicionarPersona(){
        creandoPersona();
    }
    private void creandoPersona(){
        
        
        controllerUseCase1.crearPersona(definiendoPersona());
    
    }
    private PersonaDTO definiendoPersona(){
        PersonaDTO personaDTO=new PersonaDTO (100.0, "Juan","Moreno", 40);
        return personaDTO;
    }
    
}
