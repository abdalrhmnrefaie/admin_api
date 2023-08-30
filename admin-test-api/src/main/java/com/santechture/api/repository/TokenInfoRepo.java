package com.santechture.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santechture.api.entity.TokenInfo;


@Repository
public interface TokenInfoRepo extends JpaRepository<TokenInfo, Long> {
	
	Optional<TokenInfo> findByRefreshToken (String refreshToken);

}
