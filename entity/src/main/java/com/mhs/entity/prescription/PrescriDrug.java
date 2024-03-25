package com.mhs.entity.prescription;

import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Tsong
 * @since 2024-03-24
 */
@Getter
@Setter
@TableName("tb_prescri_drug")
public class PrescriDrug {

    /**
     * prescription id
     */
    private String prescriId;

    /**
     * drug id
     */
    private String bnfCode;

    /**
     * how many unit of this drug
     */
    private Integer item;

    /**
     * item * total_quantity
     */
    private Integer totalQuantity;

    /**
     * usage of Average Daily Quantity
     */
    private Integer adqusage;

    /**
     * item * price per unit
     */
    private BigDecimal totalItemPrice;
}
