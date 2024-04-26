package edu.traning.web.dao;

import edu.traning.web.dao.impl.TicketHospitalDaoBase;
import edu.traning.web.dao.impl.UserDaoBase;

public final class DaoProvider {

    private static final DaoProvider INSTANCE;

    static {
        INSTANCE = new DaoProvider();
    }

    private DaoProvider() {
    }

    private TicketHospitalDao hospitalDao = new TicketHospitalDaoBase();
    private UserDao userDao = new UserDaoBase();

    public TicketHospitalDao getTicketHospitalDao() {
        return hospitalDao;
    }
    public UserDao getUserDao() {
        return userDao;
    }

    public static DaoProvider getInstance() {
        return INSTANCE;
    }

}