package zophyro.cl.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zophyro.cl.register.converter.LoginConverter;
import zophyro.cl.register.model.client.Login;
import zophyro.cl.register.model.client.LoginRequest;
import zophyro.cl.register.model.db.LoginModel;
import zophyro.cl.register.repository.LoginRepository;

import java.util.Collection;

@Service
@Transactional
public class LoginService {

    @Autowired
    LoginConverter loginConverter;

    @Autowired
    LoginRepository loginRepository;

    public Login save(final LoginRequest loginRequest) {
        LoginModel loginModel = loginConverter.requestToModel(loginRequest);
        LoginModel loginModelResponse = null;

        if(loginModel != null){
            Collection<LoginModel> loginCollectionByUser = loginRepository.findByUserId(loginModel.getUserId());
            Collection<LoginModel> loginCollectionByEmail = loginRepository.findByEmail(loginModel.getEmail());

            if(loginCollectionByUser == null && loginCollectionByEmail == null){
                loginModelResponse = loginRepository.save(loginModel);
            }
        }
        
        return loginConverter.modelToResponse(loginModelResponse);
    }

    public Collection<Login> findByUserId(final String userId) {
        return loginConverter.modelToResponse(loginRepository.findByUserId(userId));
    }

    public Collection<Login> findByEmail(String email) {
        return loginConverter.modelToResponse(loginRepository.findByEmail(email));
    }
}