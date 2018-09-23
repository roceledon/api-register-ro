package zophyro.cl.register.converter;

import org.springframework.stereotype.Component;
import zophyro.cl.register.converter.common.ModelConverter;
import zophyro.cl.register.model.client.Login;
import zophyro.cl.register.model.client.LoginRequest;
import zophyro.cl.register.model.db.LoginModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoginConverter implements ModelConverter<LoginRequest, LoginModel, Login> {

    @Override
    public LoginModel requestToModel(LoginRequest request) {
        if(request == null){
            return null;
        }

        LoginModel model = new LoginModel();

        if ((request.getUserId() != null)) {
            model.setUserId(request.getUserId());
        } else {
            model.setUserId("");
        }

        if(request.getUserPass() != null) {
            model.setUserPass(request.getUserPass());
        }else{
            model.setUserPass("");
        }

        if(request.getSex() != null) {
            model.setSex(request.getSex());
        }else{
            model.setSex("M");
        }

        if(request.getEmail() != null) {
            model.setEmail(request.getEmail());
        }else{
            model.setEmail("");
        }

        if(request.getBirthdate() != null) {
            model.setBirthdate(request.getBirthdate());
        }

        if(request.getPincode() != null) {
            model.setPincode(request.getPincode());
        }else{
            model.setPincode("");
        }

        model.setGroupId(0L);
        model.setState(0L);
        model.setUnbanTime(0L);
        model.setExpirationTime(0L);
        model.setLastIp("");
        model.setLoginCount(0L);
        model.setCharacterSlots(0L);
        model.setPincodeChange(0L);
        model.setVipTime(0L);
        model.setOldGroup(0L);

        return model;
    }

    @Override
    public Login modelToResponse(LoginModel model) {
        if(model == null){
            return null;
        }

        Login response = new Login();

        if(model.getAccountId() != null) {
            response.setAccountId(model.getAccountId());
        }
        if(model.getUserId() != null) {
            response.setUserId(model.getUserId());
        }
        if(model.getSex() != null) {
            response.setSex(model.getSex());
        }
        if(model.getEmail() != null) {
            response.setEmail(model.getEmail());
        }
        if(model.getBirthdate() != null) {
            response.setBirthdate(model.getBirthdate());
        }

        return response;
    }
}