package se.yong.cloud.controllers.cooking;

/**
 * Created by Yong Huang <yong.e.huang@gmail.com> on 2017-11-12.
 */
public enum RecipeName {
    CHINESE_TOMATO_EGG_STIR_FRY("Chinese tomato egg stir-fry");

    private String fullName;

    RecipeName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
