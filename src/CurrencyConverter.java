import com.google.gson.JsonObject;

public class CurrencyConverter {
    private CurrencyAPI currencyAPI = new CurrencyAPI();

    public double converterMoeda(int opcao, double valor) {
        try {
            JsonObject jsonResponse = currencyAPI.getRates();

            double taxaConversao = 0;
            switch (opcao) {
                case 1:
                    taxaConversao = jsonResponse.getAsJsonObject("rates").get("EUR").getAsDouble();
                    return valor * taxaConversao;
                case 2:
                    taxaConversao = 1 / jsonResponse.getAsJsonObject("rates").get("EUR").getAsDouble();
                    return valor * taxaConversao;
                case 3:
                    taxaConversao = jsonResponse.getAsJsonObject("rates").get("BRL").getAsDouble();
                    return valor * taxaConversao;
                case 4:
                    taxaConversao = 1 / jsonResponse.getAsJsonObject("rates").get("BRL").getAsDouble();
                    return valor * taxaConversao;
                case 5:
                    taxaConversao = jsonResponse.getAsJsonObject("rates").get("RUB").getAsDouble();
                    return valor * taxaConversao;
                case 6:
                    taxaConversao = 1 / jsonResponse.getAsJsonObject("rates").get("RUB").getAsDouble();
                    return valor * taxaConversao;
                default:
                    return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public String getMoedaOrigem(int opcao) {
        switch (opcao) {
            case 1:
            case 3:
            case 5:
                return "dólares americano";
            case 2:
                return "euros";
            case 4:
                return "reais brasileiro";
            case 6:
                return "rublos russo";
            default:
                return "";
        }
    }

    public String getMoedaDestino(int opcao) {
        switch (opcao) {
            case 1:
                return "euros";
            case 2:
                return "dólares americano";
            case 3:
                return "reais brasileiro";
            case 4:
                return "dólares americano";
            case 5:
                return "rublos russo";
            case 6:
                return "dólares americano";
            default:
                return "";
        }
    }
}
