package InicioMain;

import Authorizer.Permissions;

import Controllers.ControllerUseCase1;
import InteractorsUseCases.DefaultUseCaseFactory;
import InteractorsUseCases.UseCaseFactory;
import View.UseCases.CrearPersonaView;
import View.UseCases.ListarPersonaView;


public class InicioAplicacion {


    private static CrearPersonaView vista1;
    private static ListarPersonaView vista2;
    
    public static void main(String[] args) {
        Permissions permissions=Permissions.inicializarPermissions();
        permissions.permisosDisponibles();

        DefaultUseCaseFactory factory = DefaultUseCaseFactory.getInstance();
        ControllerUseCase1 controller = new ControllerUseCase1(factory);
        vista1=new CrearPersonaView(controller);
        vista1.adicionarPersona();
        vista1.adicionarPersona();        
        vista2= new ListarPersonaView(controller);

    }    
}
