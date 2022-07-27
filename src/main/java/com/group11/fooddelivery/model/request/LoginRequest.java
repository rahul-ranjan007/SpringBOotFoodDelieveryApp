package com.group11.fooddelivery.model.request;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest extends Request{
    @NonNull
    private String email;
    @NonNull
    private String password;
}
