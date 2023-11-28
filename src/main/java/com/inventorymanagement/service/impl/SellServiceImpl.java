package com.inventorymanagement.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventorymanagement.dto.SellDTO;
import com.inventorymanagement.entity.Product;
import com.inventorymanagement.entity.Sell;
import com.inventorymanagement.exception.NotFoundException;
import com.inventorymanagement.repo.ProductRepository;
import com.inventorymanagement.repo.SellRepository;
import com.inventorymanagement.service.SellService;

@Service
public class SellServiceImpl implements SellService {

	@Override
	public List<SellDTO> getAllSells() {
		return null;
	}

	@Override
	public SellDTO getSellById(Long id) {
		return null;
	}

	@Override
	@Transactional
	public SellDTO createSell(SellDTO sellDTO) {
		return null;
	}

	@Override
	public Map<String, Integer> getProductsSoldInLastMonth() {
		return null;
	}
}
