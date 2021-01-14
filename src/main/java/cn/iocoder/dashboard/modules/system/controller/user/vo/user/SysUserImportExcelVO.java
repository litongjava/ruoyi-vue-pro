package cn.iocoder.dashboard.modules.system.controller.user.vo.user;

import cn.iocoder.dashboard.framework.excel.core.annotations.DictFormat;
import cn.iocoder.dashboard.framework.excel.core.convert.DictConvert;
import cn.iocoder.dashboard.modules.system.enums.dict.DictTypeEnum;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 用户 Excel 导入 VO
 */
@Data
public class SysUserImportExcelVO {

    @ExcelProperty("登录名称")
    private String username;

    @ExcelProperty("用户名称")
    private String nickname;

    @ExcelProperty("部门编号")
    private Long deptId;

    @ExcelProperty("用户邮箱")
    private String email;

    @ExcelProperty("手机号码")
    private String mobile;

    @ExcelProperty(value = "用户性别", converter = DictConvert.class)
    @DictFormat(DictTypeEnum.SYS_USER_SEX)
    private String sex;

    @ExcelProperty(value = "账号状态", converter = DictConvert.class)
    @DictFormat(DictTypeEnum.SYS_COMMON_STATUS)
    private Integer status;

}
