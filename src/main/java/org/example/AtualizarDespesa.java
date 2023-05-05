package org.example;

import org.example.dao.DespesaDAO;
import org.example.model.Categoria;
import org.example.model.Despesa;

import java.util.Optional;

public class AtualizarDespesa {

    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findById(2L);

        Despesa despesa = despesaOptional.get();
        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

       /* despesa.setCategoria(Categoria.MORADIA);
        despesa.setValor(1400);
        dao.update(despesa);*/

    }

}
