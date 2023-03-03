package entities;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MaquinaRefrigerante {
    public static void iniciarVenda() {
        Scanner sc = new Scanner(System.in);
        listarRefrigerantes();
        int selecionarRefrigerante = sc.nextInt();
        Refrigerante refrigerante = getRefrigerante(selecionarRefrigerante);
        System.out.println("VALOR A PAGAR " + refrigerante.getValor());
        BigDecimal valorPagar = refrigerante.getValor();
        System.out.println("DIGITE O VALOR QUE DESEJAR INSERIR NA MAQUINA OU DIGITE 'X' PARA CANCELAR");
        String escolha = sc.next().toUpperCase();
        if (!escolha.equals("X")) {
            BigDecimal valorX = new BigDecimal(escolha);
            Venda venda = pagar(valorX, refrigerante);
            imprimirExtrato(venda);
        } else {
            System.out.println("COMPRA CANCELADA");
        }
    }
    private static void listarRefrigerantes() {
        System.out.println("ESCOLHER REFRIGERANTE");
        System.out.println("DIGITE 1 - " + TipoRefrigerante.COCA_COLA.getDescricao());
        System.out.println("DIGITE 2 - " + TipoRefrigerante.PEPSI.getDescricao());
        System.out.println("DIGITE 3 - " + TipoRefrigerante.FANTA.getDescricao());
        System.out.println("DIGITE 4 - " + TipoRefrigerante.SPRITE.getDescricao());
        System.out.println();
    }
    private static void imprimirExtrato(Venda venda){
        System.out.println("VENDA REALIZADA COM SUCESSO");
        System.out.println("PRODUTO: " + venda.getProduto());
        System.out.printf("VALOR DA VENDA: R$ %.2f\n",venda.getValorVenda());
        System.out.printf("VALOR INSERIDO: R$ %.2f\n", venda.getValorInserido());
        System.out.printf("VALOR TROCO: R$ %.2f\n", venda.getValorTroco());
        System.out.println("DATA E HORA: " + venda.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private static Refrigerante getRefrigerante(int cod) {
        return switch (cod) {
            case 1 -> new Refrigerante(TipoRefrigerante.COCA_COLA);
            case 2 -> new Refrigerante(TipoRefrigerante.PEPSI);
            case 3 -> new Refrigerante(TipoRefrigerante.FANTA);
            case 4 -> new Refrigerante(TipoRefrigerante.SPRITE);
            default -> throw new RuntimeException("CODIGO ERRO");
        };
    }

    private static Venda pagar(BigDecimal dinheiro, Refrigerante refrigerante) {
        if (dinheiro.compareTo(refrigerante.getValor()) < 0) throw new RuntimeException("VALOR INSUFICIENTE");
        LocalDateTime date = LocalDateTime.now();
        BigDecimal troco = dinheiro.remainder(refrigerante.getValor());
        return new Venda(refrigerante.getValor(), dinheiro, troco, refrigerante.getDescricao(), date);
    }


}


