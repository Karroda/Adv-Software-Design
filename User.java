

/**
 * @author zheng_zz
 */
public class User {

    private Integer id;
    private String name;
    private String phone;
    private String password;

    public User(Integer id, String name, String phone, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * A simple example of login
     * @param name
     * @param password
     */
    public void login(String name, String password){
        String accountName = "group8";
        String accountPassword = "123456";
        if (accountName.equals(name) && accountPassword.equals(password)){
            System.out.println("login successfully");
        }else{
            System.out.println("fail to login");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}