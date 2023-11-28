package com.inventorymanagement.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventorymanagement.dto.ProductDTO;
import com.inventorymanagement.entity.Product;
import com.inventorymanagement.exception.NotFoundException;
import com.inventorymanagement.repo.ProductRepository;
import com.inventorymanagement.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductDTO> getAllProducts() {
		return null;
	}

	@Override
	public ProductDTO getProductById(Long id) {
		return null;
	}

	@Override
	@Transactional
	public ProductDTO createProduct(ProductDTO productDTO) {
		return null;
	}

	@Override
	@Transactional
	public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
		return null;
	}

	@Override
	@Transactional
	public boolean deleteProduct(Long id) {
		return false;
	}

}
