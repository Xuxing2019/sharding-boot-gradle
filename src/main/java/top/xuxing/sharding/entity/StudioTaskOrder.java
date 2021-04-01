package top.xuxing.sharding.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.*;

/**
 * <p>
 * 工作室任务订单
 * </p>
 *
 * @author xhb
 * @since 2021-04-01
 */
@Getter
@Setter
public class StudioTaskOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    /**
     * 任务主键
     */
    private Integer studioTaskId;

    /**
     * 工作室用户主键
     */
    private Integer studioUserId;

    /**
     * 工作室脚本主键
     */
    private Integer studioScriptId;

    /**
     * 工作室推荐用户主键
     */
    private Integer studioRefUserId;

    /**
     * 区名字
     */
    private String zoneName;

    /**
     * 区编号
     */
    private String zoneCode;

    /**
     * 平台类型,如抖音
     */
    private String platform;

    /**
     * 业务类型,如点赞,关注,评论等
     */
    private String type;

    /**
     * 业务用户主键,如抖音uid
     */
    private String businessUserId;

    /**
     * 奖励金额
     */
    private BigDecimal rewardAmount;

    /**
     * 结算状态,0无,1已结算
     */
    private Integer settleState;

    /**
     * 检查状态-1无效0不确认1通过2无效
     */
    private Integer checkState;

    /**
     * 异常状态
     */
    private Integer failState;

    /**
     * 订单状态,0审核中,1审核通过,2无效
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

}
