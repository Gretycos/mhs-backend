package com.mhs.entity.med;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Tsong
 * @since 2024-03-25
 */
@Getter
@Setter
@TableName("tb_med_history")
public class MedHistory {

    /**
     * medical history identifier
     */
    @TableId("med_history_id")
    private String medHistoryId;

    /**
     * medical time
     */
    private LocalDateTime medTime;

    /**
     * patient identifier
     */
    private String patientId;

    /**
     * prescription identifier
     */
    private String prescriId;

    /**
     * practitioner  identifier
     */
    private String practId;

    /**
     * test report identifier
     */
    private String testId;

    /**
     * doctor diagnosis result
     */
    private String diagnosis;
}
