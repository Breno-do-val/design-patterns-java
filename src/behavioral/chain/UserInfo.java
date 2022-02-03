package behavioral.chain;

public class UserInfo {
    private String role;
    private Boolean passwordValidated;
    private Boolean isActive;

    public UserInfo(String role, Boolean passwordValidated, Boolean isActive) {
        this.role = role;
        this.passwordValidated = passwordValidated;
        this.isActive = isActive;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getPasswordValidated() {
        return passwordValidated;
    }

    public void setPasswordValidated(Boolean passwordValidated) {
        this.passwordValidated = passwordValidated;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
