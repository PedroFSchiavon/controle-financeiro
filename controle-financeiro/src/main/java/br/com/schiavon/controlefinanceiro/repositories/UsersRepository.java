package br.com.schiavon.controlefinanceiro.repositories;

import br.com.schiavon.controlefinanceiro.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UsersRepository extends JpaRepository<UsersModel, UUID> {
}
