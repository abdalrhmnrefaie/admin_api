package com.santechture.api.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.santechture.api.entity.TokenInfo;
import com.santechture.api.repository.TokenInfoRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TokenInfoService {

	private final TokenInfoRepo tokenInfoRepo = null;

	public TokenInfo findById(Long id) {

		return tokenInfoRepo.findById(id).orElse(null);
	}

	public Optional<TokenInfo> findByRefreshToken(String refreshToken) {

		return tokenInfoRepo.findByRefreshToken(refreshToken);
	}

	public TokenInfo save(TokenInfo entity) {

		return tokenInfoRepo.save(entity);
	}
	
	public void deleteById (Long id) {
		
		tokenInfoRepo.deleteById(id);
	}
}
