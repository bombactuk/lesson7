package edu.traning.web.dao.impl;

import edu.traning.web.dao.DaoException;
import edu.traning.web.dao.UserDao;
import edu.traning.web.dao.impl.configuration.ConfigFilesDataBase;
import edu.traning.web.entity.User;
import edu.traning.web.entity.UserAuthorizationInfo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoBase implements UserDao {

    private final ConfigFilesDataBase dataBase = ConfigFilesDataBase.getInstance();

    private static final String findAnAccount = "SELECT * FROM user_account WHERE login = ?" + " AND password = ?";

    @Override
    public User authorisationUser(UserAuthorizationInfo user) throws DaoException {

        ResultSet resSet;

        try (Connection dbConnection = dataBase.getConnection()) {

            PreparedStatement prSt = dbConnection.prepareStatement(findAnAccount);

            prSt.setString(1, user.getLogin());
            prSt.setString(2, user.getPassword());

            resSet = prSt.executeQuery();

            if (resSet.next()) {
                return new User(resSet.getString(3),resSet.getString(5));
            } else {
                return null;
            }

        } catch (IOException | SQLException e) {

            throw new DaoException(e);

        }

    }

    @Override
    public void registrUser() throws DaoException {

    }
}
