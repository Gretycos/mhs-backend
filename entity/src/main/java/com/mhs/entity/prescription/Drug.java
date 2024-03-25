package com.mhs.entity.prescription;

import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("tb_drug")
public class Drug {

    /**
     * drug id
     */
    @TableId("bnf_code")
    private String bnfCode;

    /**
     * drug name
     */
    private String bnfName;

    /**
     * price per unit
     */
    private BigDecimal price;

    /**
     * The quantity of a medicine
     */
    private Integer quantity;
}
