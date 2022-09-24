package cn.wenhe9.yeb.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wenhe9.yeb.server.service.DepartmentService;
import cn.wenhe9.yeb.server.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author 11623
* @description 针对表【t_department】的数据库操作Service实现
* @createDate 2022-09-24 15:16:29
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}



