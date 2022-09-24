package cn.wenhe9.yeb.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wenhe9.yeb.server.service.EmployeeService;
import cn.wenhe9.yeb.server.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author 11623
* @description 针对表【t_employee】的数据库操作Service实现
* @createDate 2022-09-24 15:16:29
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




