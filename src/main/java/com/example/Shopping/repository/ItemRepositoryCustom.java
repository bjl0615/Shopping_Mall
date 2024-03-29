package com.example.Shopping.repository;

import com.example.Shopping.dto.ItemSearchDto;
import com.example.Shopping.dto.MainItemDto;
import com.example.Shopping.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}