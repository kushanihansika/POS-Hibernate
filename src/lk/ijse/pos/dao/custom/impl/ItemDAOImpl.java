package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.CrudDAOImpl;
import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.entity.Item;

public class ItemDAOImpl extends CrudDAOImpl<Item, String> implements ItemDAO{


    @Override
    public int count() throws Exception {
        return 0;
    }
}
