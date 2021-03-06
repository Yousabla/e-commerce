package com.ecommerce.vojo.browse;

import com.ecommerce.dto.product.browse.ProductBrowseDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProductBrowseWithCatVO {
    private String catName;

    private List<ProductBrowseDTO> products;

}
