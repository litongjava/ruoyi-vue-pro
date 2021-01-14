package cn.iocoder.dashboard.modules.system.service.dict;

import cn.iocoder.dashboard.common.pojo.PageResult;
import cn.iocoder.dashboard.modules.system.controller.dict.vo.type.SysDictTypeCreateReqVO;
import cn.iocoder.dashboard.modules.system.controller.dict.vo.type.SysDictTypeExportReqVO;
import cn.iocoder.dashboard.modules.system.controller.dict.vo.type.SysDictTypePageReqVO;
import cn.iocoder.dashboard.modules.system.controller.dict.vo.type.SysDictTypeUpdateReqVO;
import cn.iocoder.dashboard.modules.system.dal.mysql.dataobject.dict.SysDictTypeDO;

import java.util.List;

/**
 * 字典类型 Service 接口
 *
 * @author 芋道源码
 */
public interface SysDictTypeService {

    /**
     * 获得字典类型分页列表
     *
     * @param reqVO 分页请求
     * @return 字典类型分页列表
     */
    PageResult<SysDictTypeDO> pageDictTypes(SysDictTypePageReqVO reqVO);

    /**
     * 获得字典类型列表
     *
     * @param reqVO 列表请求
     * @return 字典类型列表
     */
    List<SysDictTypeDO> listDictTypes(SysDictTypeExportReqVO reqVO);

    /**
     * 获得字典类型详情
     *
     * @param id 字典类型编号
     * @return 字典类型
     */
    SysDictTypeDO getDictType(Long id);

    /**
     * 获得字典类型详情
     *
     * @param type 字典类型
     * @return 字典类型详情
     */
    SysDictTypeDO getDictType(String type);

    /**
     * 创建字典类型
     *
     * @param reqVO 字典类型信息
     * @return 字典类型编号
     */
    Long createDictType(SysDictTypeCreateReqVO reqVO);

    /**
     * 更新字典类型
     *
     * @param reqVO 字典类型信息
     */
    void updateDictType(SysDictTypeUpdateReqVO reqVO);

    /**
     * 删除字典类型
     *
     * @param id 字典类型编号
     */
    void deleteDictType(Long id);

    /**
     * 获得全部字典类型列表
     *
     * @return 字典类型列表
     */
    List<SysDictTypeDO> listDictTypes();

}
