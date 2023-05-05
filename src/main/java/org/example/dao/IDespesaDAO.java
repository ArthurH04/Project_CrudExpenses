package org.example.dao;

import org.example.model.Categoria;
import org.example.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesaDAO {

    Despesa save (Despesa despesa);
    Despesa update (Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(Long id); //Optional pois o ID pode não existir, não retornando nenhuma despesa
    List<Despesa> findByCategoria(Categoria categoria);

}
