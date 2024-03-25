package com.mhs.entity.prescription;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@TableName("tb_prescri")
public class Prescri {

    /**
     * prescription id
     */
    @TableId("prescri_id")
    private String prescriId;

    /**
     * prescription time
     */
    private LocalDateTime prescriTime;

    /**
     * patient id
     */
    private String patientId;

    /**
     * practitioner id
     */
    private String practId;

    /**
     * pharmacy id
     */
    private String pharId;

    /**
     * sum of price of each drug
     */
    private BigDecimal totalPrice;
}
