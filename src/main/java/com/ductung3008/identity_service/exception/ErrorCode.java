package com.ductung3008.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTS(1002, "User already exists"),
    USERNAME_INVALID(1003, "Username must be between 5 and 20 characters long"),
    PASSWORD_INVALID(1004, "Password must be between 8 and 20 characters long"),
    USER_NOT_EXISTED(1005, "User does not exist"),
    ;
    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
