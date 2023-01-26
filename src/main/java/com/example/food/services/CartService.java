package com.example.food.services;

import com.example.food.dto.CartDto;
import com.example.food.model.Users;
import com.example.food.pojos.CartResponse;
import com.example.food.restartifacts.BaseResponse;

public interface CartService {
    BaseResponse removeCartItem(long cartItemId);

    CartResponse addCartItem(Long productId);

    CartResponse clearCart();
}