package entity;

import java.util.Date;

public class SysLog {
    private Long id;//主键id
    private String loginName;//登陆名
    private String roleName;//角色名
    private String optContent;//内容
    private String clientIp;//客户端ip
    private java.util.Date createTime;//创建时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getOptContent() {
        return optContent;
    }

    public void setOptContent(String optContent) {
        this.optContent = optContent;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", optContent='" + optContent + '\'' +
                ", clientIp='" + clientIp + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
