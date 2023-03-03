package application;

import entities.MaquinaRefrigerante;
import entities.TipoRefrigerante;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        MaquinaRefrigerante.iniciarVenda();


        sc.close();
    }
}
