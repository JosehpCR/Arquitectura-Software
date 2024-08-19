package InteractorsUseCases;

public class DefaultUseCaseFactory extends UseCaseFactory{

    private static  DefaultUseCaseFactory instance;

    private DefaultUseCaseFactory(){}

    public static DefaultUseCaseFactory getInstance(){
        if (instance == null){
            instance = new DefaultUseCaseFactory();
        }
        return instance;
    }
    @Override
    public CrearPersonaUseCase createCrearPersonaUseCase() {
        return new CrearPersonaUseCase();
    }

    @Override
    public ListarPersonasUseCase createListarPersonasUseCase() {
        return new ListarPersonasUseCase();
    }
}
