package com.sarawipay.practica.repository;

import com.sarawipay.practica.model.Merchant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MerchantRepository extends CrudRepository<Merchant, String> {
    Optional<Merchant> clientMerchant(Merchant merchant);
}
