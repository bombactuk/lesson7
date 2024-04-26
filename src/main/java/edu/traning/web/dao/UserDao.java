package edu.traning.web.dao;

import edu.traning.web.entity.User;
import edu.traning.web.entity.UserAuthorizationInfo;

public interface UserDao {

    User authorisationUser(UserAuthorizationInfo user) throws DaoException;

    void registrUser() throws DaoException;

}
