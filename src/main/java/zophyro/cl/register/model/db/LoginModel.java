package zophyro.cl.register.model.db;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="login")
public class LoginModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;
    @Column(name = "userid")
    private String userId;
    @Column(name = "user_pass")
    private String userPass;
    @Column(name = "sex")
    private String sex;
    @Column(name = "email")
    private String email;
    @Column(name = "group_id")
    private Long groupId;
    @Column(name = "state")
    private Long state;
    @Column(name = "unban_time")
    private Long unbanTime;
    @Column(name = "expiration_time")
    private Long expirationTime;
    @Column(name = "logincount")
    private Long loginCount;
    @Column(name = "lastlogin")
    private DateTime lastLogin;
    @Column(name = "last_ip")
    private String lastIp;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "character_slots")
    private Long characterSlots;
    @Column(name = "pincode")
    private String pincode;
    @Column(name = "pincode_change")
    private Long pincodeChange;
    @Column(name = "vip_time")
    private Long vipTime;
    @Column(name = "old_group")
    private Long oldGroup;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getUnbanTime() {
        return unbanTime;
    }

    public void setUnbanTime(Long unbanTime) {
        this.unbanTime = unbanTime;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Long getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    public DateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(DateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Long getCharacterSlots() {
        return characterSlots;
    }

    public void setCharacterSlots(Long characterSlots) {
        this.characterSlots = characterSlots;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Long getPincodeChange() {
        return pincodeChange;
    }

    public void setPincodeChange(Long pincodeChange) {
        this.pincodeChange = pincodeChange;
    }

    public Long getVipTime() {
        return vipTime;
    }

    public void setVipTime(Long vipTime) {
        this.vipTime = vipTime;
    }

    public Long getOldGroup() {
        return oldGroup;
    }

    public void setOldGroup(Long oldGroup) {
        this.oldGroup = oldGroup;
    }
}