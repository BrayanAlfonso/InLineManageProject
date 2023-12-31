package model;

public class UsuarioVo {
    //!NOTA En las clases Vo almacenamos los datos que nos llegan de las vistas y la base de datos. Como una pequeña ram intermediaria.
    
    //SECCION Atributos
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPassword;


    //?SECCION Getters & Setters    
    //idUsuario
    

    // SECCION Constructors
    public UsuarioVo() {
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserFirstName() {
        return userFirstName;
    }
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    public String getUserLastName() {
        return userLastName;
    }
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public UsuarioVo(int userId, String userFirstName, String userLastName, String userEmail, String userPassword) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
    

    
}