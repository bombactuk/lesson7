package edu.traning.web.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.traning.web.dao.DaoException;
import edu.traning.web.dao.TicketHospitalDao;
import edu.traning.web.dao.impl.configuration.ConfigFilesDataBase;

public class TicketHospitalDaoBase implements TicketHospitalDao {
	
	private final ConfigFilesDataBase dataBase = ConfigFilesDataBase.getInstance();
	
    private static final String findAnAccount = "SELECT * FROM authorization WHERE login = ?" + " AND password = ?";


}