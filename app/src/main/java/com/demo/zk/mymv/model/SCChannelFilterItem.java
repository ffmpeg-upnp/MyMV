package com.demo.zk.mymv.model;


import com.demo.zk.mymv.MyApplication;

/**
 * Created by fire3 on 15-1-20.
 */
public class SCChannelFilterItem {
    private String searchVal;
    private String searchKey;
    private String parentKey;
    private String displayName;
    private boolean isChecked = false;

    public SCChannelFilterItem(String searchVal, String displayName) {
        this.searchVal = searchVal;
        this.displayName = displayName;
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public String getSearchVal() {
        return searchVal;
    }

    public void setSearchVal(String searchVal) {
        this.searchVal = searchVal;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    @Override
    public String toString() {
        return "SCChannelFilterItem{" +
                "searchVal='" + searchVal + '\'' +
                ", searchKey='" + searchKey + '\'' +
                ", displayName='" + displayName + '\'' +
                ", isChecked=" + isChecked +
                '}';
    }


    public String toJson() {
        String ret = MyApplication.getGson().toJson(this);
        return ret;
    }

    public static SCChannelFilterItem fromJson(String json) {
        SCChannelFilterItem filter  = MyApplication.getGson().fromJson(json,SCChannelFilterItem.class);
        return filter;
    }

}
