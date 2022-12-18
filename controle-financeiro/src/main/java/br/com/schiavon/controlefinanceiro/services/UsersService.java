package br.com.schiavon.controlefinanceiro.services;

import br.com.schiavon.controlefinanceiro.models.UsersModel;
import br.com.schiavon.controlefinanceiro.repositories.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public UsersModel save(UsersModel usersModel){
        return usersRepository.save(usersModel);
    }
}
