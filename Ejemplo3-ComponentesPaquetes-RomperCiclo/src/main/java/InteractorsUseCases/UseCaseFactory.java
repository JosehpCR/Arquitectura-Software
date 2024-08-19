package InteractorsUseCases;

public abstract class UseCaseFactory {
    public abstract CrearPersonaUseCase createCrearPersonaUseCase();
    public abstract ListarPersonasUseCase createListarPersonasUseCase();
}

