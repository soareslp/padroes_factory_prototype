package factorymethod.model;

public class ServicoConsulta implements IServico {

    public String executar() {
        return "Consulta realizada!";
    }

    public String cancelar() { return "Consulta cancelada!"; }
}
