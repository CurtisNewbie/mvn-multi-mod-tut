module com.curtisnewbie.mainappmodule {
    requires com.curtisnewbie.entitymodule;
    requires com.curtisnewbie.daomodule;
    requires com.curtisnewbie.userdaomodule;

    uses com.curtisnewbie.userdaomodule.UserDao;
}
