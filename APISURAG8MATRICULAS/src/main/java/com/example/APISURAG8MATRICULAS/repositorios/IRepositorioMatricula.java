package com.example.APISURAG8MATRICULAS.repositorios;

import com.example.APISURAG8MATRICULAS.modelos.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioMatricula extends JpaRepository<Matricula, Integer> {
}
