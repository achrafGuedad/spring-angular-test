package lu.atozdigital.api.services;


import lu.atozdigital.api.models.AppRole;
import lu.atozdigital.api.models.AppUser;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {


    @Override
    public AppUser saveUser(String username, String password, String confirmedPassword) {
        return null;
    }

    @Override
    public AppRole save(AppRole role) {
        return null;
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String rolename) {

    }
}
