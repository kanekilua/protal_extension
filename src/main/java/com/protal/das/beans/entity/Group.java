package com.protal.das.beans.entity;

import java.io.Serializable;

public class Group implements Serializable {
    private Long groupid;

    private Long companyid;

    private Long creatoruserid;

    private Long classnameid;

    private Long classpk;

    private Long parentgroupid;

    private Long livegroupid;

    private String name;

    private String description;

    private Integer type;

    private String typesettings;

    private String friendlyurl;

    private Boolean active;

    private static final long serialVersionUID = 1L;

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Long getCreatoruserid() {
        return creatoruserid;
    }

    public void setCreatoruserid(Long creatoruserid) {
        this.creatoruserid = creatoruserid;
    }

    public Long getClassnameid() {
        return classnameid;
    }

    public void setClassnameid(Long classnameid) {
        this.classnameid = classnameid;
    }

    public Long getClasspk() {
        return classpk;
    }

    public void setClasspk(Long classpk) {
        this.classpk = classpk;
    }

    public Long getParentgroupid() {
        return parentgroupid;
    }

    public void setParentgroupid(Long parentgroupid) {
        this.parentgroupid = parentgroupid;
    }

    public Long getLivegroupid() {
        return livegroupid;
    }

    public void setLivegroupid(Long livegroupid) {
        this.livegroupid = livegroupid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypesettings() {
        return typesettings;
    }

    public void setTypesettings(String typesettings) {
        this.typesettings = typesettings == null ? null : typesettings.trim();
    }

    public String getFriendlyurl() {
        return friendlyurl;
    }

    public void setFriendlyurl(String friendlyurl) {
        this.friendlyurl = friendlyurl == null ? null : friendlyurl.trim();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupid=").append(groupid);
        sb.append(", companyid=").append(companyid);
        sb.append(", creatoruserid=").append(creatoruserid);
        sb.append(", classnameid=").append(classnameid);
        sb.append(", classpk=").append(classpk);
        sb.append(", parentgroupid=").append(parentgroupid);
        sb.append(", livegroupid=").append(livegroupid);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", typesettings=").append(typesettings);
        sb.append(", friendlyurl=").append(friendlyurl);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}