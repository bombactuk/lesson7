package edu.traning.web.logic;

import edu.traning.web.entity.User;
import edu.traning.web.entity.UserAuthorizationInfo;

public interface UserLogic {

    User authorisationUser(UserAuthorizationInfo user) throws LogicException;

    void registrUser() throws LogicException;

}
