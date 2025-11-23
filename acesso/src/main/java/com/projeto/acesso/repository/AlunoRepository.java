package com.projeto.acesso.repository;

import com.projeto.acesso.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// Isso aqui faz a mágica de criar os SELECT, INSERT e DELETE sozinho
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<Aluno> findByCartaoRfid(String cartaoRfid);
}