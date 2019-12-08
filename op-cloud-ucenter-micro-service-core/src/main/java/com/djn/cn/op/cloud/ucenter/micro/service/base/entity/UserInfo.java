package com.djn.cn.op.cloud.ucenter.micro.service.base.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UCT_SYS_UserInfo
 */
@Table(name = "UCT_SYS_UserInfo")
public class UserInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 生成时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "lastUpdateTime")
    private Date lastUpdateTime;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     *  创建者Id
     */
    @Column(name = "creatorId")
    private Long creatorId;

    /**
     * 最后修改者
     */
    @Column(name = "lastUpdateUserId")
    private Long lastUpdateUserId;

    /**
     * 是否删除 
     */
    @Column(name = "deleted")
    private Boolean deleted;

    /**
     * 当前版本号
     */
    @Column(name = "version")
    private Long version;

    /**
     * key to pretend order duplication
     */
    @Column(name = "dedupKey")
    private String dedupKey;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 邮箱地址
     */
    @Column(name = "email")
    private String email;

    /**
     * 年龄
     */
    @Column(name = "age")
    private Integer age;

    /**
     * QQ号码
     */
    @Column(name = "qq")
    private String qq;

    /**
     * 电话号码
     */
    @Column(name = "telphone")
    private String telphone;

    /**
     * 地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 性别
     */
    @Column(name = "sex")
    private String sex;

    /**
     * 是否锁定
     */
    @Column(name = "locked")
    private Boolean locked;

    /**
     * 是否激活
     */
    @Column(name = "activated")
    private Boolean activated;

    /**
     * 密码盐
     */
    @Column(name = "salt")
    private String salt;

    /**
     * ID
     * @return id ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 生成时间
     * @return createTime 生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 生成时间
     * @param createTime 生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * @return lastUpdateTime 最后修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后修改时间
     * @param lastUpdateTime 最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     *  创建者Id
     * @return creatorId  创建者Id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     *  创建者Id
     * @param creatorId  创建者Id
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 最后修改者
     * @return lastUpdateUserId 最后修改者
     */
    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * 最后修改者
     * @param lastUpdateUserId 最后修改者
     */
    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    /**
     * 是否删除 
     * @return deleted 是否删除 
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 是否删除 
     * @param deleted 是否删除 
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 当前版本号
     * @return version 当前版本号
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 当前版本号
     * @param version 当前版本号
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * key to pretend order duplication
     * @return dedupKey key to pretend order duplication
     */
    public String getDedupKey() {
        return dedupKey;
    }

    /**
     * key to pretend order duplication
     * @param dedupKey key to pretend order duplication
     */
    public void setDedupKey(String dedupKey) {
        this.dedupKey = dedupKey == null ? null : dedupKey.trim();
    }

    /**
     * 用户名
     * @return userName 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 邮箱地址
     * @return email 邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱地址
     * @param email 邮箱地址
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 年龄
     * @return age 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年龄
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * QQ号码
     * @return qq QQ号码
     */
    public String getQq() {
        return qq;
    }

    /**
     * QQ号码
     * @param qq QQ号码
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 电话号码
     * @return telphone 电话号码
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 电话号码
     * @param telphone 电话号码
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 性别
     * @return sex 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 是否锁定
     * @return locked 是否锁定
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 是否锁定
     * @param locked 是否锁定
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * 是否激活
     * @return activated 是否激活
     */
    public Boolean getActivated() {
        return activated;
    }

    /**
     * 是否激活
     * @param activated 是否激活
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * 密码盐
     * @return salt 密码盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 密码盐
     * @param salt 密码盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}