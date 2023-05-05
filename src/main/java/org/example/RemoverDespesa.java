package org.example;

import org.example.dao.DespesaDAO;

public class RemoverDespesa {

    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        dao.delete(3L);
    }
}
