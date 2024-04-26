package edu.traning.web.logic.impl;

import edu.traning.web.dao.DaoException;
import edu.traning.web.dao.DaoProvider;
import edu.traning.web.dao.TicketHospitalDao;
import edu.traning.web.logic.LogicException;
import edu.traning.web.logic.TicketHospitalLogic;

public class TicketHospitalLogicImpl implements TicketHospitalLogic{
	
    private final DaoProvider provider = DaoProvider.getInstance();
    private final TicketHospitalDao dao = provider.getTicketHospitalDao();

    
    
}
