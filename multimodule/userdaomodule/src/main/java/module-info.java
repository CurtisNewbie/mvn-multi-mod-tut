module com.curtisnewbie.userdaomodule {

    requires com.curtisnewbie.entitymodule;

    requires com.curtisnewbie.daomodule;

    provides com.curtisnewbie.daomodule.Dao with com.curtisnewbie.userdaomodule.UserDao;

    exports com.curtisnewbie.userdaomodule;
}
