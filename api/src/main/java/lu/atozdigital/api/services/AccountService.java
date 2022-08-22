package lu.atozdigital.api.services;


import lu.atozdigital.api.models.AppRole;
import lu.atozdigital.api.models.AppUser;

public interface AccountService {
    public AppUser  saveUser(String username, String password, String confirmedPassword);
    public AppRole save(AppRole role);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username,String rolename);
}