package edu.dio.bancodigital.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCPFCNPJ {


    public static boolean validarCPF (String cpf) {


        Pattern validaCPF = Pattern.compile("^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$");
        Matcher m = validaCPF.matcher(cpf);

        return m.matches();

    }


    public static boolean validarCNPJ (String cnpj) {

        Pattern validaCNPJ = Pattern.compile("^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$");
        Matcher m = validaCNPJ.matcher(cnpj);

        return m.matches();

    }



}
