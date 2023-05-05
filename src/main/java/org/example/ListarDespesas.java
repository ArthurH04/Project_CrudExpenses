package org.example;

import org.example.dao.DespesaDAO;
import org.example.model.Categoria;
import org.example.model.Despesa;

import java.util.List;

public class ListarDespesas {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();

        List<Despesa> despesas = dao.findByCategoria(Categoria.TRANSPORTE);
        for (Despesa despesa : despesas) {
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Categoria: " + despesa.getCategoria());
            System.out.println("Valor: " + despesa.getValor());
            //System.out.println("Date: " + despesa.getData());

            System.out.println("####################");

        /*Optional<Despesa> despesaOptional = dao.findById(2L);
        despesaOptional.ifPresent(despesa -> {
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Valor: " + despesa.getValor());
            System.out.println("Date: " + despesa.getData());

            System.out.println("####################");

        });*/


        /*List<Despesa> despesas = dao.findAll();

        for (Despesa despesa : despesas) {
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descrição: " + despesa.getDescricao());
            System.out.println("Valor: " + despesa.getValor());
            System.out.println("Date: " + despesa.getData());

            System.out.println("####################");
        }*/



        /*Despesa despesa = new Despesa();
        despesa.setDescricao("Viagem com Uber até o Aeroporto");
        despesa.setCategoria(Categoria.TRANSPORTE);
        despesa.setValor(110);
        despesa.setData(LocalDate.of(2023, 5, 4));

        Despesa despesaInserida = dao.save(despesa);
        System.out.println("Foi inserida a despesa com id: " + despesaInserida.getId());*/


    }

}}
