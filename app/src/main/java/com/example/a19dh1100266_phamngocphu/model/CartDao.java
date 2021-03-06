package com.example.a19dh1100266_phamngocphu.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CartDao {
    @Query("SELECT * FROM Cart")
    List<Cart> getAll();

    @Insert
    void insertAll(Cart... carts);

    @Insert
    void insertCart(Cart cart);

    @Delete
    void deleteCart(Cart cart);

    @Update
    void updateCart(Cart cart);

    @Delete
    void deleteMultiCart(Cart... cart);

    @Query("DELETE FROM Cart")
    void delete();

    @Query("UPDATE Cart SET quantity = :qty WHERE foodKey = :foodKey")
    void updateQty(String foodKey,int qty);

    @Query("SELECT * FROM Cart WHERE foodKey = :foodKey")
    Cart findByID(String foodKey);
}
