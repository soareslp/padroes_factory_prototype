package factorymethod.model;

public class ServicoRaioX implements IServico {

    public String executar() {
        return "Procedimento de Raio X realizado!";
    }

    public String cancelar() {
        return "Procedimento de Raio X cancelado!";
    }
}
