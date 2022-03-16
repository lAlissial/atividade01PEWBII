package br.com.ifpb.si.pwebii.atividade01qst10.questao.repository;

import br.com.ifpb.si.pwebii.atividade01qst10.questao.model.MegaSena;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@Scope("application")
public interface MegaSenaRepository extends JpaRepository<MegaSena, Integer> {
}
    

