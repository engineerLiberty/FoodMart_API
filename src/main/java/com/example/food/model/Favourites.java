package com.example.food.model;

import com.example.food.model.Product;
import com.example.food.model.Users;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "Favourites")
public class Favourites {
    @Id
    private Long id;
    private Long userId;
    private Long productId;
}
