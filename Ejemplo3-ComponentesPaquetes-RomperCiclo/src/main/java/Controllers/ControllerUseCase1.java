
package Controllers;

import DTO.PersonaDTO;
import InteractorsUseCases.*;
import java.util.List;

public class ControllerUseCase1 {
    
    private UseCaseFactory useCaseFactory;

    public ControllerUseCase1(UseCaseFactory useCaseFactory){
        this.useCaseFactory = useCaseFactory;
    }
    public boolean crearPersona(PersonaDTO personaDTO)            
    {
        CrearPersonaUseCase crearPersona = useCaseFactory.createCrearPersonaUseCase();
        
        return crearPersona.inicializarPersona(personaDTO);
    }
    public List<PersonaDTO> listadoPersonas()
    {
        ListarPersonasUseCase listarPersonas = useCaseFactory.createListarPersonasUseCase();
        return listarPersonas.listadoPersonas();

    }
        
}
