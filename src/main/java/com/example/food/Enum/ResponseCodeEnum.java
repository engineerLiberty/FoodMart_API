package com.example.food.Enum;

import lombok.Getter;

/**
 *
 * @author Odira Eze
 */
@Getter
public enum ResponseCodeEnum {

    SUCCESS(0, "Success"),
    ERROR(-1, "An error occurred. Error message : ${errorMessage}"),

    UNAUTHORISED_ACCESS(-7,"unauthorised access"),

    PRODUCT_NOT_FOUND(-2, "No products found"),
    ERROR_EMAIL_INVALID(-3, "Invalid email address."),
    ERROR_PASSWORD_MISMATCH(-4,"Password does not match"),
    ERROR_DUPLICATE_USER(-5,"User already exist."),
    ERROR_RESETTING_PASSWORD(-6, "Password reset unsuccessful. Contact the Admin."),

//    you can add your custom error codes as shown below just ensure that error codes have a minus sign
//    ERROR_SETTING_THRESHOLD(-2, "An error occurred"),
    ;

    ResponseCodeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private final int code;
    private final String description;

}
