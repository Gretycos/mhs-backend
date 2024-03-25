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
@TableName("tb_test_report")
public class TestReport {

    /**
     * test report identifier
     */
    @TableId("test_id")
    private String testId;

    /**
     * test report date
     */
    private LocalDateTime testDate;

    /**
     * patient identifier
     */
    private String patientId;

    /**
     * practitioner identifier
     */
    private String practId;

    /**
     * select test type
     */
    private Byte testType;

    /**
     * test result image
     */
    private String image;

    /**
     * test result text
     */
    private String result;
}
